package com.portfolio.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.portfolio.bean.CreateProfileBean;
import com.portfolio.service.CreateProfileMgmtService;

@Entity
@Controller
public class UpdateProfileController {

	@ManyToOne
	@Autowired
	private CreateProfileMgmtService createProfileMgmtDao;

	private static String UPLOAD_LOCATION = "D:\\Java\\portfolio\\WebRoot\\resources\\avatars\\";

	@RequestMapping(value = "/uploadHomeInfo")
	public String homePageInfo(
			@ModelAttribute("CreateProfileBean") CreateProfileBean createProfileBean,
			ModelMap model) {
		System.out.println("ACESS ID ::: " + createProfileBean.getAcessId());
		
		String result = "";
		String result1 = "";
		String result2 = "";
		if (createProfileBean.getProfileImage() != null) {
			result1 = singleImageSave(createProfileBean.getProfileImage());
		}
		if (createProfileBean.getBgImage() != null) {
			result2 = singleImageSave(createProfileBean.getBgImage());
		}
		if (result1 != "success") {
			System.out
					.println("********************* PROFILE IMAGE UPLOADING FAILED ***************************");
		}
		if (result2 != "success") {
			System.out
					.println("*********************** BG IMAGE UPLOADING FAILED ******************************");
		}
		//result = createProfileMgmtDao.saveHomeInfo(createProfileBean);
		System.out.println("result ::: " + result);

		model.addAttribute("createProfileBean", createProfileBean);
		return "createPortfolio/createPortfolio";
	}

	public String singleImageSave(MultipartFile file) {
		String fileName = null;
		if (!file.isEmpty()) {
			try {
				fileName = file.getOriginalFilename();
				System.out.println("fileName " + fileName);
				byte[] bytes = file.getBytes();
				BufferedOutputStream buffStream = new BufferedOutputStream(
						new FileOutputStream(new File(UPLOAD_LOCATION + ""
								+ fileName)));
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
