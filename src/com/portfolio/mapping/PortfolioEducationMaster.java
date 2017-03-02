package com.portfolio.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * PortfolioEducationMaster entity. @author MyEclipse Persistence Tools
 */

@Entity
public class PortfolioEducationMaster implements java.io.Serializable {

	// Fields

	@Id
	@GeneratedValue
	private Integer id;
	private Integer userId;
	private String schoolName;
	private String universityName;
	private String address;
	private String domain;
	private String percentage;
	private String yearOfPassing;
	private String description;
	private String status;

	// Constructors

	/** default constructor */
	public PortfolioEducationMaster() {
	}

	/** minimal constructor */
	public PortfolioEducationMaster(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public PortfolioEducationMaster(Integer id, Integer userId,
			String schoolName, String universityName, String address,
			String domain, String percentage, String yearOfPassing,
			String description, String status) {
		this.id = id;
		this.userId = userId;
		this.schoolName = schoolName;
		this.universityName = universityName;
		this.address = address;
		this.domain = domain;
		this.percentage = percentage;
		this.yearOfPassing = yearOfPassing;
		this.description = description;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getUniversityName() {
		return this.universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPercentage() {
		return this.percentage;
	}

	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	public String getYearOfPassing() {
		return this.yearOfPassing;
	}

	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}