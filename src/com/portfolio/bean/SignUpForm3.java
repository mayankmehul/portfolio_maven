package com.portfolio.bean;

import java.util.ArrayList;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class SignUpForm3 {

	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> schoolUniversityName;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> subject;
	
	@NotEmpty
	private ArrayList<String> percentage;
	
	@NotEmpty
	private ArrayList<String> passingYear;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> discriptionSubject;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> schoolUniversityAddress;

	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> companyName;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> designation;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> skills;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> companyAddress;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> descriptionCompany;
	
	@NotEmpty
	private ArrayList<String> startDate;
	
	@NotEmpty
	private ArrayList<String> endDate;
	
	@NotEmpty
	@Size(min = 2, max = 24)
	private ArrayList<String> yourSkill;
	
	@NotEmpty
	private ArrayList<String> skillWeightage;
	
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
	public ArrayList<String> getSchoolUniversityAddress() {
		return schoolUniversityAddress;
	}
	public void setSchoolUniversityAddress(ArrayList<String> schoolUniversityAddress) {
		this.schoolUniversityAddress = schoolUniversityAddress;
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
}
