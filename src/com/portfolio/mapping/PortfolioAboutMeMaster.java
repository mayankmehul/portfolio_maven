package com.portfolio.mapping;

/**
 * PortfolioAboutMeMaster entity. @author MyEclipse Persistence Tools
 */

public class PortfolioAboutMeMaster implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer userId;
	private String aboutMe;
	private Integer subMasterCommonId;

	// Constructors

	/** default constructor */
	public PortfolioAboutMeMaster() {
	}

	/** minimal constructor */
	public PortfolioAboutMeMaster(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public PortfolioAboutMeMaster(Integer id, Integer userId, String aboutMe,
			Integer subMasterCommonId) {
		this.id = id;
		this.userId = userId;
		this.aboutMe = aboutMe;
		this.subMasterCommonId = subMasterCommonId;
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

	public String getAboutMe() {
		return this.aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public Integer getSubMasterCommonId() {
		return this.subMasterCommonId;
	}

	public void setSubMasterCommonId(Integer subMasterCommonId) {
		this.subMasterCommonId = subMasterCommonId;
	}

}