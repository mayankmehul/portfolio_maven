package com.portfolio.bean;

import java.io.Serializable;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class SignUpForm1 implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private String acessId;
	
	@NotEmpty
	@Email
	private String emailAddress;

	@NotEmpty
	@Pattern(regexp = "\\d{10}")
	private String phoneNumber;

	@NotEmpty
	@Size(min = 8, max = 24)
	private String password;

	@NotEmpty
	private String confirmPassword;

	@NotEmpty
	private String sex;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private String userName;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private String firstName;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private String lastName;
	
	@NotEmpty
	@Size(min = 1, max = 120)
	private String tagLine;
	
	@NotEmpty
	@Size(min = 1, max = 120)
	private String currentAddress;
	
	@NotEmpty
	@Size(min = 1, max = 120)
	private String saySomething;

	private MultipartFile profileImage;
	private MultipartFile bgImage;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getAcessId() {
		return acessId;
	}
	public void setAcessId(String acessId) {
		this.acessId = acessId;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTagLine() {
		return tagLine;
	}
	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}
	public MultipartFile getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(MultipartFile profileImage) {
		this.profileImage = profileImage;
	}
	public MultipartFile getBgImage() {
		return bgImage;
	}
	public void setBgImage(MultipartFile bgImage) {
		this.bgImage = bgImage;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setSaySomething(String saySomething) {
		this.saySomething = saySomething;
	}
	public String getSaySomething() {
		return saySomething;
	}
}
