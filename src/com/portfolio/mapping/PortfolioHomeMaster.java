package com.portfolio.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * PortfolioHomeMaster entity. @author MyEclipse Persistence Tools
 */

@Entity
public class PortfolioHomeMaster implements java.io.Serializable {

	// Fields

	@Id
	@GeneratedValue
	private Integer id;
	private Integer userId;
	private String tagLine;
	private String avatarImageName;
	private String homeImageName;

	// Constructors

	/** default constructor */
	public PortfolioHomeMaster() {
	}

	/** full constructor */
	public PortfolioHomeMaster(Integer userId, String tagLine,
			String avatarImageName, String homeImageName) {
		this.userId = userId;
		this.tagLine = tagLine;
		this.avatarImageName = avatarImageName;
		this.homeImageName = homeImageName;
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

	public String getTagLine() {
		return this.tagLine;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}

	public String getAvatarImageName() {
		return this.avatarImageName;
	}

	public void setAvatarImageName(String avatarImageName) {
		this.avatarImageName = avatarImageName;
	}

	public String getHomeImageName() {
		return this.homeImageName;
	}

	public void setHomeImageName(String homeImageName) {
		this.homeImageName = homeImageName;
	}

}