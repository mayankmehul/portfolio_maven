package com.portfolio.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * PortfolioAboutMeSubMaster entity. @author MyEclipse Persistence Tools
 */

@Entity
public class PortfolioAboutMeSubMaster implements java.io.Serializable {

	// Fields

	@Id
	@GeneratedValue
	private Integer id;
	private Integer commonId;
	private String menu;
	private String heading;
	private String description;
	private String imageName;
	private String status;

	// Constructors

	/** default constructor */
	public PortfolioAboutMeSubMaster() {
	}

	/** full constructor */
	public PortfolioAboutMeSubMaster(Integer commonId, String menu,
			String heading, String description, String imageName, String status) {
		this.commonId = commonId;
		this.menu = menu;
		this.heading = heading;
		this.description = description;
		this.imageName = imageName;
		this.status = status;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCommonId() {
		return this.commonId;
	}

	public void setCommonId(Integer commonId) {
		this.commonId = commonId;
	}

	public String getMenu() {
		return this.menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getHeading() {
		return this.heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}