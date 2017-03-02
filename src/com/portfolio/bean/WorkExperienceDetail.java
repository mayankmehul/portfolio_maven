package com.portfolio.bean;

import javax.persistence.Entity;

@Entity
public class WorkExperienceDetail {

	private String companyDetail;
	private String designation;
	private String description;
	private String joiningDate;

	public String getCompanyDetail() {
		return companyDetail;
	}

	public void setCompanyDetail(String companyDetail) {
		this.companyDetail = companyDetail;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

}
