package com.portfolio.mapping;

/**
 * PortfolioSkillMaster entity. @author MyEclipse Persistence Tools
 */

public class PortfolioSkillMaster implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String skillCategory;
	private String skillSubCategory;
	private String marks;
	private String status;

	// Constructors

	/** default constructor */
	public PortfolioSkillMaster() {
	}

	/** minimal constructor */
	public PortfolioSkillMaster(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public PortfolioSkillMaster(Integer id, Integer userId,
			String skillCategory, String skillSubCategory, String marks,
			String status) {
		this.id = id;
		this.userId = userId;
		this.skillCategory = skillCategory;
		this.skillSubCategory = skillSubCategory;
		this.marks = marks;
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

	public String getSkillCategory() {
		return this.skillCategory;
	}

	public void setSkillCategory(String skillCategory) {
		this.skillCategory = skillCategory;
	}

	public String getSkillSubCategory() {
		return this.skillSubCategory;
	}

	public void setSkillSubCategory(String skillSubCategory) {
		this.skillSubCategory = skillSubCategory;
	}

	public String getMarks() {
		return this.marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}