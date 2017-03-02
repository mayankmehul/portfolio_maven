package com.portfolio.service;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.portfolio.bean.SignUpForm1;
import com.portfolio.bean.SignUpForm2;
import com.portfolio.bean.SignUpForm3;
import com.portfolio.dao.CreateProfileMgmtDao;

@Entity
public class CreateProfileMgmtService {

	@ManyToOne
	private CreateProfileMgmtDao createProfileMgmtDao;
	
	public void setCreateProfileMgmtDao(CreateProfileMgmtDao createProfileMgmtDao) {
		this.createProfileMgmtDao = createProfileMgmtDao;
	}
	
	public Integer getPlayerMasterUserId(String acessId) {
		return createProfileMgmtDao.getPlayerMasterUserId(acessId);
	}
	
	public Integer getPlayerAboutMeCommonId(Integer userId) {
		return createProfileMgmtDao.getPlayerAboutMeCommonId(userId);
	}
	
	public String addNewUserPortfolioPlayerMasterInfo(SignUpForm1 signUpForm1) {
		return createProfileMgmtDao.addNewUserPortfolioPlayerMasterInfo(signUpForm1);
	}
	
	public String addNewUserPortfolioHomeMasterInfo(SignUpForm1 signUpForm1, Integer userId) {
		return createProfileMgmtDao.addNewUserPortfolioHomeMasterInfo(signUpForm1, userId);
	}
	
	public String addNewUserPortfolioAboutMeMasterInfo(String aboutMe, Integer userId) {
		return createProfileMgmtDao.addNewUserPortfolioAboutMeMasterInfo(aboutMe, userId);
	}
	
	public String addNewUserPortfolioAboutMeSubMasterInfo(SignUpForm2 signUpForm2, Integer commonId) {
		return createProfileMgmtDao.addNewUserPortfolioAboutMeSubMasterInfo(signUpForm2, commonId);
	}
	
	public String addNewUserPortfolioEducationMasterInfo(SignUpForm3 signUpForm3, Integer userId) {
		return createProfileMgmtDao.addNewUserPortfolioEducationMasterInfo(signUpForm3, userId);
	}
	
	public String addNewUserPortfolioSkillMasterInfo(SignUpForm3 signUpForm3, Integer userId) {
		return createProfileMgmtDao.addNewUserPortfolioSkillMasterInfo(signUpForm3, userId);
	}
	
	public String addNewUserPortfolioWorkexpMasterInfo(SignUpForm3 signUpForm3, Integer userId) {
		return createProfileMgmtDao.addNewUserPortfolioWorkexpMasterInfo(signUpForm3, userId);
	}
	
	public boolean checkIfUsernameExist(String userName) {
		return createProfileMgmtDao.checkIfUsernameExist(userName);
	}
	public boolean checkIfEmailExist(String email) {
		return createProfileMgmtDao.checkIfEmailExist(email);
	}
	public boolean checkIfContactNumberExist(String contactNumber) {
		return createProfileMgmtDao.checkIfContactNumberExist(contactNumber);
	}
}
