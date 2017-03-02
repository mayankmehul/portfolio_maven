package com.portfolio.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

import javax.persistence.Entity;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

@Entity
public class CreateProfileBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	@Email
	private String emailAddress;

	@NotEmpty
	@Pattern(regexp = "\\d{10}")
	private String phoneNumber;

	@NotEmpty
	@Size(min=8, max=24)
	private String password;

	@NotEmpty
	@Size(min=8, max=24)
	private String confirmPassword;
	
	private String sex;
	private Integer userId;
	private String acessId;
	private String userName;
	private String firstName;
	private String lastName;
	private String tagLine;
	private MultipartFile profileImage;
	private MultipartFile bgImage;

	private String aboutMe;
	private ArrayList<String> headingAboutMe;
	private ArrayList<String> descriptionAboutMe;
	private ArrayList<MultipartFile> imageAboutMe;
	private ArrayList<String> headingWorkProcess;
	private ArrayList<String> descriptionWorkProcess;
	private ArrayList<MultipartFile> imageWorkProcess;
	private ArrayList<String> headingFunFact;
	private ArrayList<String> descriptionFunFact;
	private ArrayList<MultipartFile> imageFunFact;

	private ArrayList<String> schoolUniversityName;
	private ArrayList<String> subject;
	private ArrayList<String> percentage;
	private ArrayList<String> passingYear;
	private ArrayList<String> discriptionSubject;
	private ArrayList<String> schoolUniversityAddress;

	private ArrayList<String> companyName;
	private ArrayList<String> designation;
	private ArrayList<String> skills;
	private ArrayList<String> companyAddress;
	private ArrayList<String> descriptionCompany;
	private ArrayList<String> startDate;
	private ArrayList<String> endDate;
	private ArrayList<String> yourSkill;
	private ArrayList<String> skillWeightage;

	private String contactNumber;
	private String contactEmail;
	private String currentAddress;
	private String saySomething;

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

	public void setDescriptionWorkProcess(
			ArrayList<String> descriptionWorkProcess) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ArrayList<String> getSchoolUniversityName() {
		return schoolUniversityName;
	}

	public void setSchoolUniversityName(ArrayList<String> schoolUniversityName) {
		this.schoolUniversityName = schoolUniversityName;
	}

	public ArrayList<String> getSubject() {
		return subject;
	}

	public void setSubject(ArrayList<String> subject) {
		this.subject = subject;
	}

	public ArrayList<String> getPercentage() {
		return percentage;
	}

	public void setPercentage(ArrayList<String> percentage) {
		this.percentage = percentage;
	}

	public ArrayList<String> getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(ArrayList<String> passingYear) {
		this.passingYear = passingYear;
	}

	public ArrayList<String> getDiscriptionSubject() {
		return discriptionSubject;
	}

	public void setDiscriptionSubject(ArrayList<String> discriptionSubject) {
		this.discriptionSubject = discriptionSubject;
	}

	public void setSchoolUniversityAddress(
			ArrayList<String> schoolUniversityAddress) {
		this.schoolUniversityAddress = schoolUniversityAddress;
	}

	public ArrayList<String> getSchoolUniversityAddress() {
		return schoolUniversityAddress;
	}

	public ArrayList<String> getCompanyName() {
		return companyName;
	}

	public void setCompanyName(ArrayList<String> companyName) {
		this.companyName = companyName;
	}

	public ArrayList<String> getDesignation() {
		return designation;
	}

	public void setDesignation(ArrayList<String> designation) {
		this.designation = designation;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public ArrayList<String> getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(ArrayList<String> companyAddress) {
		this.companyAddress = companyAddress;
	}

	public ArrayList<String> getDescriptionCompany() {
		return descriptionCompany;
	}

	public void setDescriptionCompany(ArrayList<String> descriptionCompany) {
		this.descriptionCompany = descriptionCompany;
	}

	public ArrayList<String> getStartDate() {
		return startDate;
	}

	public void setStartDate(ArrayList<String> startDate) {
		this.startDate = startDate;
	}

	public ArrayList<String> getEndDate() {
		return endDate;
	}

	public void setEndDate(ArrayList<String> endDate) {
		this.endDate = endDate;
	}

	public ArrayList<String> getYourSkill() {
		return yourSkill;
	}

	public void setYourSkill(ArrayList<String> yourSkill) {
		this.yourSkill = yourSkill;
	}

	public ArrayList<String> getSkillWeightage() {
		return skillWeightage;
	}

	public void setSkillWeightage(ArrayList<String> skillWeightage) {
		this.skillWeightage = skillWeightage;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getSaySomething() {
		return saySomething;
	}

	public void setSaySomething(String saySomething) {
		this.saySomething = saySomething;
	}

	public static void main(String[] args) {
		SignUpBean p = new SignUpBean();
		p.setEmailAddress("a");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Set<ConstraintViolation<SignUpBean>> constraints = factory
				.getValidator().validate(p);
		System.out.println("constraints = " + constraints + "\n\n");
		// constraint will have the results of validation
	}
}
