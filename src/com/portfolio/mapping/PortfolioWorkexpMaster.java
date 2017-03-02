package com.portfolio.mapping;

/**
 * PortfolioWorkexpMaster entity. @author MyEclipse Persistence Tools
 */

public class PortfolioWorkexpMaster implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String companyName;
	private String designation;
	private String technologies;
	private String comanyAddress;
	private String description;
	private String joiningDate;
	private String endDate;
	private String status;

	// Constructors

	/** default constructor */
	public PortfolioWorkexpMaster() {
	}

	/** minimal constructor */
	public PortfolioWorkexpMaster(Integer id, String joiningDate, String endDate) {
		this.id = id;
		this.joiningDate = joiningDate;
		this.endDate = endDate;
	}

	/** full constructor */
	public PortfolioWorkexpMaster(Integer id, Integer userId,
			String companyName, String designation, String technologies,
			String comanyAddress, String description, String joiningDate,
			String endDate, String status) {
		this.id = id;
		this.userId = userId;
		this.companyName = companyName;
		this.designation = designation;
		this.technologies = technologies;
		this.comanyAddress = comanyAddress;
		this.description = description;
		this.joiningDate = joiningDate;
		this.endDate = endDate;
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

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTechnologies() {
		return this.technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public String getComanyAddress() {
		return this.comanyAddress;
	}

	public void setComanyAddress(String comanyAddress) {
		this.comanyAddress = comanyAddress;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJoiningDate() {
		return this.joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}