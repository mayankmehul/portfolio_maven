package com.portfolio.service;

import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.portfolio.bean.SignUpBean;
import com.portfolio.dao.SignUpMgmtDao;
import com.portfolio.mapping.PortfolioAboutMeMaster;
import com.portfolio.mapping.PortfolioAboutMeSubMaster;
import com.portfolio.mapping.PortfolioEducationMaster;
import com.portfolio.mapping.PortfolioHomeMaster;
import com.portfolio.mapping.PortfolioPlayerMaster;
import com.portfolio.mapping.PortfolioPropertyMaster;
import com.portfolio.mapping.PortfolioSkillMaster;
import com.portfolio.mapping.PortfolioWorkexpMaster;


@Entity
public class SignUpMgmtService {
	
	@ManyToOne
	private SignUpMgmtDao signUpMgmtDao;

	public String saveSignUpInfo(SignUpBean bean){
		return signUpMgmtDao.saveSignUpInfo(bean);
	}

	public PortfolioHomeMaster getUserHomeInfo(Integer userId){
		return signUpMgmtDao.getUserHomeInfo(userId);
	}
	
	public Map<String,PortfolioPropertyMaster> getPropertyMaster(){
		return signUpMgmtDao.getPropertyMaster();
	}
	
	public PortfolioPropertyMaster getPropertyMasterByPropertyName(String propertyCode){
		return signUpMgmtDao.getPropertyMasterByPropertyName(propertyCode);
	}
	
	public PortfolioAboutMeMaster getUserAboutMeInfo(Integer userId) {
		return signUpMgmtDao.getUserAboutMeInfo(userId);
	}
	
	public List<PortfolioAboutMeSubMaster> getSubUserAboutMeInfo(Integer userId) {
		return signUpMgmtDao.getSubUserAboutMeInfo(userId);
	}
	
	public List<PortfolioWorkexpMaster> getUserWorkExp(Integer userId) {
		return signUpMgmtDao.getUserWorkExp(userId);
	}
	
	public List<PortfolioEducationMaster> getUserEducation(Integer userId) {
		return signUpMgmtDao.getUserEducation(userId);
	}
	
	public List<PortfolioSkillMaster> getUserSkillInfo(Integer userId) {
		return signUpMgmtDao.getUserSkillInfo(userId);
	}
	
	public PortfolioPlayerMaster getPlayerMaster(Integer userId) {
		return signUpMgmtDao.getPlayerMaster(userId);
	}
	
	public SignUpMgmtDao getSignUpMgmtDao() {
		return signUpMgmtDao;
	}

	public void setSignUpMgmtDao(SignUpMgmtDao signUpMgmtDao) {
		this.signUpMgmtDao = signUpMgmtDao;
	}
	
	public PortfolioPlayerMaster getPlayerMasterInfo(String acessId) {
		return signUpMgmtDao.getPlayerMasterInfo(acessId);
	}
	
	public String getPlayerAcessId(SignUpBean signUpBean) {
		return signUpMgmtDao.getPlayerAcessId(signUpBean);
	}
	
	public Integer getAboutMeSubMasterCommonIdByUserId(Integer userId) {
		return signUpMgmtDao.getAboutMeSubMasterCommonIdByUserId(userId);
	}
}
