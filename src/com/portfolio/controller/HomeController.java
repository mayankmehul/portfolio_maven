package com.portfolio.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.persistence.Entity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Entity
@Controller
public class HomeController {
	//private static String UPLOAD_LOCATION="/home/welcome/";
	private static String UPLOAD_LOCATION="D:\\Java\\portfolio\\WebRoot\\resources\\avatars\\";
	
	@RequestMapping(value="/uploadImg", method=RequestMethod.POST )
    public  void singleSave(@RequestParam("file") MultipartFile file){
    	String fileName = null;
    	if (!file.isEmpty()) {
            try {
                fileName = file.getOriginalFilename();
                System.out.println("fileName "+fileName);
                byte[] bytes = file.getBytes();
                BufferedOutputStream buffStream = 
                        new BufferedOutputStream(new FileOutputStream(new File(UPLOAD_LOCATION+""+fileName)));
                buffStream.write(bytes);
                buffStream.close();
                //return "You have successfully uploaded " + fileName;
            } catch (Exception e) {
            	System.out.println("EEROR : " + e.getMessage());
                //return "You failed to upload " + fileName + ": " + e.getMessage();
            }
        } else {
            //return "Unable to upload. File is empty.";
        }
    }
	/*
	public String createProfileForm(@RequestParam("formData" MultipartFile String)) {
		
	}
	*/
}
