package com.portfolio.bean;

import java.util.ArrayList;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class SignUpForm2 {

	@NotEmpty
	@Size(min = 2, max = 24)
	private String aboutMe;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> headingAboutMe;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> descriptionAboutMe;
	
	private ArrayList<MultipartFile> imageAboutMe;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> headingWorkProcess;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> descriptionWorkProcess;
	
	private ArrayList<MultipartFile> imageWorkProcess;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> headingFunFact;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> descriptionFunFact;
	
	private ArrayList<MultipartFile> imageFunFact;
	
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public ArrayList<String> getHeadingAboutMe() {
		return headingAboutMe;
	}
	public void setHeadingAboutMe(ArrayList<String> headingAboutMe) {
		this.headingAboutMe = headingAboutMe;
	}
	public ArrayList<String> getDescriptionAboutMe() {
		return descriptionAboutMe;
	}
	public void setDescriptionAboutMe(ArrayList<String> descriptionAboutMe) {
		this.descriptionAboutMe = descriptionAboutMe;
	}
	public ArrayList<MultipartFile> getImageAboutMe() {
		return imageAboutMe;
	}
	public void setImageAboutMe(ArrayList<MultipartFile> imageAboutMe) {
		this.imageAboutMe = imageAboutMe;
	}
	public ArrayList<String> getHeadingWorkProcess() {
		return headingWorkProcess;
	}
	public void setHeadingWorkProcess(ArrayList<String> headingWorkProcess) {
		this.headingWorkProcess = headingWorkProcess;
	}
	public ArrayList<String> getDescriptionWorkProcess() {
		return descriptionWorkProcess;
	}
	public void setDescriptionWorkProcess(ArrayList<String> descriptionWorkProcess) {
		this.descriptionWorkProcess = descriptionWorkProcess;
	}
	public ArrayList<MultipartFile> getImageWorkProcess() {
		return imageWorkProcess;
	}
	public void setImageWorkProcess(ArrayList<MultipartFile> imageWorkProcess) {
		this.imageWorkProcess = imageWorkProcess;
	}
	public ArrayList<String> getHeadingFunFact() {
		return headingFunFact;
	}
	public void setHeadingFunFact(ArrayList<String> headingFunFact) {
		this.headingFunFact = headingFunFact;
	}
	public ArrayList<String> getDescriptionFunFact() {
		return descriptionFunFact;
	}
	public void setDescriptionFunFact(ArrayList<String> descriptionFunFact) {
		this.descriptionFunFact = descriptionFunFact;
	}
	public ArrayList<MultipartFile> getImageFunFact() {
		return imageFunFact;
	}
	public void setImageFunFact(ArrayList<MultipartFile> imageFunFact) {
		this.imageFunFact = imageFunFact;
	}
}
