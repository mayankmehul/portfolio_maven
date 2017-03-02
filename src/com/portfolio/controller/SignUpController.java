package com.portfolio.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portfolio.bean.SignUpBean;
import com.portfolio.mapping.PortfolioAboutMeMaster;
import com.portfolio.mapping.PortfolioAboutMeSubMaster;
import com.portfolio.mapping.PortfolioEducationMaster;
import com.portfolio.mapping.PortfolioHomeMaster;
import com.portfolio.mapping.PortfolioPlayerMaster;
import com.portfolio.mapping.PortfolioSkillMaster;
import com.portfolio.mapping.PortfolioWorkexpMaster;
import com.portfolio.service.SignUpMgmtService;

@Controller
public class SignUpController {
	private static Log log = LogFactory.getLog(SignUpController.class);
	@Autowired
	private SignUpMgmtService signUpMgmtService;
	private String basePath = "signup";

	@RequestMapping(value = "/addContact")
	public String addContact(
			@ModelAttribute("SignUpBean") SignUpBean signUpBean, ModelMap model) {
		try {
			log.info("User Name is  " + signUpBean.getEmailAddress()
					+ " signup ");
			String result = signUpMgmtService.saveSignUpInfo(signUpBean);
			log.info("result = " + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return basePath + "/signUp";
	}

	@RequestMapping(value = "/editPortfolio")
	public String addContact(ModelMap model) {

		PortfolioPlayerMaster portfolioPlayerMaster = signUpMgmtService
				.getPlayerMaster(1);
		model.addAttribute("emailAddress", portfolioPlayerMaster.getEmailId());
		model.addAttribute("phnNo", portfolioPlayerMaster.getMobile());
		model.addAttribute("address", portfolioPlayerMaster.getAddress());

		String baseUrl = signUpMgmtService.getPropertyMasterByPropertyName(
				"FETCH_CONTENT_PATH").getValue()
				+ "/1/";
		PortfolioHomeMaster portfolioHomeMaster = signUpMgmtService
				.getUserHomeInfo(1);
		model.addAttribute("avatar", baseUrl + "home/"
				+ portfolioHomeMaster.getAvatarImageName());
		model.addAttribute("home", baseUrl + "home/"
				+ portfolioHomeMaster.getHomeImageName());
		model.addAttribute("tagLine", portfolioHomeMaster.getTagLine());
		PortfolioAboutMeMaster portfolioAboutMeMaster = signUpMgmtService
				.getUserAboutMeInfo(1);

		model.addAttribute("aboutMe", portfolioAboutMeMaster.getAboutMe());
		List<PortfolioAboutMeSubMaster> portfolioAboutMeSubMasterList = signUpMgmtService
				.getSubUserAboutMeInfo(portfolioAboutMeMaster
						.getSubMasterCommonId());
		for (PortfolioAboutMeSubMaster portfolioAboutMeSubMaster : portfolioAboutMeSubMasterList) {
			portfolioAboutMeSubMaster.setImageName(baseUrl + "aboutme/"
					+ portfolioAboutMeSubMaster.getImageName());
		}
		model.addAttribute("aboutMeSubMaster", portfolioAboutMeSubMasterList);

		List<PortfolioWorkexpMaster> portfolioWorkexpMaster = signUpMgmtService
				.getUserWorkExp(1);
		model.addAttribute("workexpMasterList", portfolioWorkexpMaster);

		List<PortfolioEducationMaster> portfolioEducationMaster = signUpMgmtService
				.getUserEducation(1);
		model.addAttribute("educationMasterList", portfolioEducationMaster);

		List<PortfolioSkillMaster> portfolioSkillMasterList = signUpMgmtService
				.getUserSkillInfo(1);
		
		model.addAttribute("portfolioSkillMasterList",
						portfolioSkillMasterList);

		return basePath + "/signUp";

	}

}
