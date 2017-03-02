package com.portfolio.mapping;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * PortfolioPlayerMaster entity. @author MyEclipse Persistence Tools
 */

@Entity
public class PortfolioPlayerMaster implements java.io.Serializable {

	// Fields

	@Id
	@GeneratedValue
	private Integer userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private Timestamp registrationDate;
	private Timestamp birthdayDate;
	private String mobile;
	private String emailId;
	private String address;
	private String gender;
	private String acessId;
	private String lastLoginIp;
	private String status;
	private Boolean isAdmin;

	// Constructors

	/** default constructor */
	public PortfolioPlayerMaster() {
	}

	/** full constructor */
	public PortfolioPlayerMaster(String userName, String firstName,
			String lastName, String password, Timestamp registrationDate,
			Timestamp birthdayDate, String mobile, String emailId,
			String address, String gender, String acessId, String lastLoginIp,
			String status) {
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.registrationDate = registrationDate;
		this.birthdayDate = birthdayDate;
		this.mobile = mobile;
		this.emailId = emailId;
		this.address = address;
		this.gender = gender;
		this.acessId = acessId;
		this.lastLoginIp = lastLoginIp;
		this.status = status;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Timestamp getBirthdayDate() {
		return this.birthdayDate;
	}

	public void setBirthdayDate(Timestamp birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAcessId() {
		return this.acessId;
	}

	public void setAcessId(String acessId) {
		this.acessId = acessId;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

}