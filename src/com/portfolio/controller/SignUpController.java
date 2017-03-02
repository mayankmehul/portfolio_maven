package com.portfolio.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.portfolio.bean.AboutMeSubMasterDetail;
import com.portfolio.bean.EducationDetail;
import com.portfolio.bean.SignUpForm1;
import com.portfolio.bean.SignUpForm2;
import com.portfolio.bean.SignUpForm3;
import com.portfolio.bean.SkillDetail;
import com.portfolio.bean.UserBasicInfoDetail;
import com.portfolio.bean.WorkExperienceDetail;
import com.portfolio.service.CreateProfileMgmtService;
import com.portfolio.service.SignUpMgmtService;
import com.portfolio.service.UserDetailMgmtService;

@Entity
@Controller
public class SignUpController {
	private static Log log = LogFactory.getLog(SignUpController.class);
	
	@ManyToOne
	@Autowired
	public SignUpMgmtService signUpMgmtService;

	@ManyToOne
	@Autowired
	public CreateProfileMgmtService createProfileMgmtService;
	
	@ManyToOne
	@Autowired
	public UserDetailMgmtService userDetailMgmtService;
	
	public String basePath = "signup";
	public static String UPLOAD_LOCATION = "D:\\Java\\jboss-4.2.2.GA\\server\\default\\deploy\\PORTFOLIOContent.war\\content\\";
	
	@RequestMapping(value = "signMeUp")
	public String userSpecificRedirector(ModelMap model, HttpSession session) {
		//session.setAttribute("acessId", "brad.pitt@mail.com_1470314303946");
		//model = setDisplayDetailsToModel(session, model);
		model.addAttribute("signUpForm1", new SignUpForm1());
		model.addAttribute("signUpForm2", new SignUpForm2());
		model.addAttribute("signUpForm3", new SignUpForm3());
		model.addAttribute("displayForm", "form1");
		//return "createPortfolio/cp1";
		return "createProfile";
	}
	
	@RequestMapping(value = "/mypage/*")
	public String userSpecificRedirector(HttpServletRequest request, ModelMap model, HttpSession session) {
		String url = request.getRequestURI();
		String[] splitter = url.split("/");
		String acessId = splitter[splitter.length - 1];
		session.setAttribute("acessId", acessId);
		model = setDisplayDetailsToModel(session, model);
		return "signup/signup";
	}
		
	public ModelMap setDisplayDetailsToModel(HttpSession session, ModelMap model) {
		HashMap<String, Object> modelMapData;
		String acessId = (String) session.getAttribute("acessId");
		if (session.getAttribute("modelMapData") == null) {
			modelMapData = setDisplayDetailsToMap(acessId);
			session.setAttribute("modelMapData", modelMapData);
		}
		modelMapData = (HashMap<String, Object>) session.getAttribute("modelMapData");
		model.addAttribute("userBasicInfoDetail", modelMapData.get("userBasicInfoDetail"));
		model.addAttribute("aboutMeSubMasterDetailList", modelMapData.get("aboutMeSubMasterDetailList"));
		model.addAttribute("workExperienceDetailList", modelMapData.get("workExperienceDetailList"));
		model.addAttribute("educationDetailList", modelMapData.get("educationDetailList"));
		model.addAttribute("skillDetailList", modelMapData.get("skillDetailList"));
		return model;
	}
	
	private HashMap<String, Object> setDisplayDetailsToMap(String acessId) {
		HashMap<String, Object> modelMapData = new HashMap<String, Object>();
		Integer userId = createProfileMgmtService.getPlayerMasterUserId(acessId);
		Integer commonId = signUpMgmtService.getAboutMeSubMasterCommonIdByUserId(userId);
		String baseUrl = signUpMgmtService.getPropertyMasterByPropertyName("FETCH_CONTENT_PATH").getValue() + "/" + userId + "/";
		
		UserBasicInfoDetail userBasicInfoDetail = userDetailMgmtService.getUserBasicDetail(userId, baseUrl);
		List<AboutMeSubMasterDetail> aboutMeSubMasterDetailList = userDetailMgmtService.getAboutMeSubMasterDetail(commonId, baseUrl);
		List<WorkExperienceDetail> workExperienceDetailList = userDetailMgmtService.getWorkExperienceDetail(userId);
		List<EducationDetail> educationDetailList = userDetailMgmtService.getEducationDetail(userId);
		List<SkillDetail> skillDetailList = userDetailMgmtService.getSkillDetail(userId);
		
		modelMapData.put("userBasicInfoDetail", userBasicInfoDetail);
		modelMapData.put("aboutMeSubMasterDetailList", aboutMeSubMasterDetailList);
		modelMapData.put("workExperienceDetailList", workExperienceDetailList);
		modelMapData.put("educationDetailList", educationDetailList);
		modelMapData.put("skillDetailList", skillDetailList);
		
		return modelMapData;
	}
	/*
	@RequestMapping(value="signUpForm-*")
	public String signUpPageProvider(HttpServletRequest request, HttpServletResponse responce, 
			HttpSession session, ModelMap model) {
		String str = request.getRequestURI().split("-")[1];
		switch (Integer.parseInt(str)) {
		case 1:
			if(!model.containsAttribute("signUpForm1"))
				model.addAttribute("signUpForm1", new SignUpForm1());
			break;
		case 2:
			if(!model.containsAttribute("signUpForm2"))
				model.addAttribute("signUpForm2", new SignUpForm2());
			break;
		case 3:
			if(!model.containsAttribute("signUpForm3"))
				model.addAttribute("signUpForm3", new SignUpForm3());
			break;
		default:
			System.out.println("****************** EEROR : NO SIGN UP FORM FOR THIS *****************");
			break;
		}
		return "mydemo/mySignUpForm"+str;
	}
	*/
	@RequestMapping(value="signUpForm1Validation")
	public String signUpForm1Validation(@ModelAttribute("signUpForm1") @Valid SignUpForm1 signUpForm1, 
			BindingResult bindingResult, ModelMap model, HttpServletRequest request, HttpSession session) {
		boolean validationPassed = true;
		if(bindingResult.hasErrors()){
			validationPassed = false;
		}
		if(!createProfileMgmtService.checkIfUsernameExist(signUpForm1.getUserName())){
			validationPassed = false;
			bindingResult.rejectValue("userName", "ALREADY_EXIST");
		}
		if(!createProfileMgmtService.checkIfEmailExist(signUpForm1.getEmailAddress())){
			validationPassed = false;
			bindingResult.rejectValue("emailAddress", "ALREADY_EXIST");
		}
		if(!createProfileMgmtService.checkIfContactNumberExist(signUpForm1.getPhoneNumber())){
			validationPassed = false;
			bindingResult.rejectValue("phoneNumber", "ALREADY_EXIST");
		}
		if(!validationPassed){
			System.out.println("*********** FORM FAILED IN VALIDATION *********");
			model.addAttribute("displayForm", "form1");
		}else{
			session.setAttribute("signUpForm1", signUpForm1);
			model.addAttribute("signUpForm1", new SignUpForm1());
			model.addAttribute("displayForm", "form2");
		}
		model.addAttribute("signUpForm2", new SignUpForm2());
		model.addAttribute("signUpForm3", new SignUpForm3());
		return "createProfile";
	}
	
	@RequestMapping(value="signUpForm2Validation")
	public String signUpForm2Validation(@ModelAttribute("signUpForm2") @Valid SignUpForm2 signUpForm2, 
			BindingResult bindingResult, ModelMap model, HttpSession session) {
		if(bindingResult.hasErrors()){
			System.out.println("*********** FORM FAILED IN VALIDATION *********");
			model.addAttribute("displayForm", "form2");
		}else{
			session.setAttribute("signUpForm2", signUpForm2);
			model.addAttribute("signUpForm2", new SignUpForm2());
			model.addAttribute("displayForm", "form3");
		}
		model.addAttribute("signUpForm1", new SignUpForm1());
		model.addAttribute("signUpForm3", new SignUpForm3());
		return "createProfile";
	}
	
	@RequestMapping(value="signUpForm3Validation")
	public String signUpForm3Validation(@ModelAttribute("signUpForm3") @Valid SignUpForm3 signUpForm3, 
			BindingResult bindingResult, ModelMap model, HttpSession session) {
		if(bindingResult.hasErrors()){
			System.out.println("*********** FORM FAILED IN VALIDATION *********");
			model = setDisplayDetailsToModel(session, model);
			System.out.println("MODEL ------>>>>>> " + model);
			return "signup/signup";
		}
		session.setAttribute("signUpForm3", signUpForm3);
		String acessId = createUserProfile((SignUpForm1)session.getAttribute("signUpForm1"), 
				(SignUpForm2)session.getAttribute("signUpForm2"), (SignUpForm3)session.getAttribute("signUpForm3"));
		System.out.println("CREATING PROFILE FOR USER ------>>>>>>>> " + acessId);
		
		session.removeAttribute("signUpForm1");
		session.removeAttribute("signUpForm2");
		session.removeAttribute("signUpForm3");
		session.removeAttribute("modelMapData");
		session.removeAttribute("acessId");
		session.setAttribute("acessId", acessId);
		
		//session.setAttribute("signUpFormNumber", 1);
		model = setDisplayDetailsToModel(session, model);
		return "signup/signup";
	}
	
	private String createUserProfile(SignUpForm1 signUpForm1, SignUpForm2 signUpForm2, SignUpForm3 signUpForm3) {
		
		int i;
		String result = "";
		String acessId = signUpForm1.getEmailAddress()+"_"+System.currentTimeMillis();
		System.out.println("acessId ----------------->>>>>>>>>>>>>>>>>>>>>>>>>> " + acessId);
		signUpForm1.setAcessId(acessId);
		result = createProfileMgmtService.addNewUserPortfolioPlayerMasterInfo(signUpForm1);
		Integer userId = createProfileMgmtService.getPlayerMasterUserId(acessId);
		
		String baseUrl = signUpMgmtService.getPropertyMasterByPropertyName("UPLOAD_CONTENT_PATH_W")
				.getValue() + "/" + userId + "/";
		
		if(signUpForm1.getProfileImage()!=null){
			result = singleImageSave(signUpForm1.getProfileImage(), (baseUrl + userId + "\\home\\"));
			if (result != "success") {
				System.out.println("************* PROFILE IMAGE UPLOADING FAILED ************");
			}
		}
		if(signUpForm1.getBgImage()!=null){
			result = singleImageSave(signUpForm1.getBgImage(), (baseUrl + "home/"));
			if (result != "success") {
				System.out.println("************* BACKGROUND IMAGE UPLOADING FAILED ************");
			}
		}
		for(i=0;i<signUpForm2.getImageAboutMe().size();i++){
			result = singleImageSave(signUpForm2.getImageAboutMe().get(i), (baseUrl + "aboutme/"));
			if (result != "success") {
				System.out.println("************* ImageAboutMe["+i+"] UPLOADING FAILED ************");
			}
		}
		for(i=0;i<signUpForm2.getImageFunFact().size();i++){
			result = singleImageSave(signUpForm2.getImageFunFact().get(i), (baseUrl + "aboutme/"));
			if (result != "success") {
				System.out.println("************* ImageFunFact["+i+"] UPLOADING FAILED ************");
			}
		}
		for(i=0;i<signUpForm2.getImageWorkProcess().size();i++){
			result = singleImageSave(signUpForm2.getImageWorkProcess().get(i), (baseUrl + "aboutme/"));
			if (result != "success") {
				System.out.println("************* ImageWorkProcess["+i+"] UPLOADING FAILED ************");
			}
		}
		
		result = createProfileMgmtService.addNewUserPortfolioHomeMasterInfo(signUpForm1, userId);
		result = createProfileMgmtService.addNewUserPortfolioAboutMeMasterInfo(signUpForm2.getAboutMe(), userId);
		Integer commonId = createProfileMgmtService.getPlayerAboutMeCommonId(userId);
		result = createProfileMgmtService.addNewUserPortfolioAboutMeSubMasterInfo(signUpForm2, commonId);
		result = createProfileMgmtService.addNewUserPortfolioEducationMasterInfo(signUpForm3, userId);
		result = createProfileMgmtService.addNewUserPortfolioSkillMasterInfo(signUpForm3, userId);
		result = createProfileMgmtService.addNewUserPortfolioWorkexpMasterInfo(signUpForm3, userId);
		
		if (result == "SUCCESS")
			return acessId;
		else
			return "FAILED";
	}
	
	private String singleImageSave(MultipartFile file, String baseUrl) {
		String fileName = null;
		File uploadPath = new File(baseUrl);
		if(!uploadPath.exists()){
			System.out.println("Creating directory: " + baseUrl);
			Boolean bool = uploadPath.mkdirs();
			System.out.println("RESULT ::: " + bool);
		}
		if (!file.isEmpty()) {
			try {
				fileName = file.getOriginalFilename();
				System.out.println("fileName " + fileName);
				byte[] bytes = file.getBytes();
				BufferedOutputStream buffStream = new BufferedOutputStream(
						new FileOutputStream(new File(baseUrl + "" + fileName)));
				buffStream.write(bytes);
				buffStream.close();
				return "success";
				// return "You have successfully uploaded " + fileName;
			} catch (Exception e) {
				System.out.println("EEROR : " + e.getMessage());
				return "failure";
				// return "You failed to upload " + fileName + ": " +
				// e.getMessage();
			}
		} else {
			return "failure";
			// return "Unable to upload. File is empty.";
		}
	}
}