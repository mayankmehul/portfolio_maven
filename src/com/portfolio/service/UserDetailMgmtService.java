package com.portfolio.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.portfolio.bean.AboutMeSubMasterDetail;
import com.portfolio.bean.EducationDetail;
import com.portfolio.bean.SkillDetail;
import com.portfolio.bean.UserBasicInfoDetail;
import com.portfolio.bean.WorkExperienceDetail;
import com.portfolio.dao.UserDetailMgmtDao;
import com.portfolio.mapping.PortfolioAboutMeMaster;
import com.portfolio.mapping.PortfolioAboutMeSubMaster;
import com.portfolio.mapping.PortfolioEducationMaster;
import com.portfolio.mapping.PortfolioHomeMaster;
import com.portfolio.mapping.PortfolioPlayerMaster;
import com.portfolio.mapping.PortfolioSkillMaster;
import com.portfolio.mapping.PortfolioWorkexpMaster;

@Entity
public class UserDetailMgmtService {

	@ManyToOne
	private UserDetailMgmtDao userDetailMgmtDao;
	
	public void setUserDetailMgmtDao(UserDetailMgmtDao userDetailMgmtDao) {
		this.userDetailMgmtDao = userDetailMgmtDao;
	}
	
	public PortfolioPlayerMaster getPortfolioPlayerMasterDetail(Integer userId) {
		return userDetailMgmtDao.getPortfolioPlayerMasterDetail(userId);
	}
	
	public PortfolioHomeMaster getPortfolioHomeMasterDetail(Integer userId) {
		return userDetailMgmtDao.getPortfolioHomeMasterDetail(userId);
	}
	
	public PortfolioAboutMeMaster getPortfolioAboutMeMasterDetail(Integer userId) {
		return userDetailMgmtDao.getPortfolioAboutMeMasterDetail(userId);
	}
	
	public List<PortfolioAboutMeSubMaster> getPortfolioAboutMeSubMasterDetail(Integer commonId){
		return userDetailMgmtDao.getPortfolioAboutMeSubMasterDetail(commonId);
	}
	
	public List<PortfolioEducationMaster> getPortfolioEducationMasterDetail(Integer userId) {
		return userDetailMgmtDao.getPortfolioEducationMasterDetail(userId);
	}
	
	public List<PortfolioSkillMaster> getPortfolioSkillMasterDetail(Integer userId) {
		return userDetailMgmtDao.getPortfolioSkillMasterDetail(userId);
	}
	
	public List<PortfolioWorkexpMaster> getPortfolioWorkexpMasterDetail(Integer userId) {
		return userDetailMgmtDao.getPortfolioWorkexpMasterDetail(userId);
	}
	
	public UserBasicInfoDetail getUserBasicDetail(Integer userId, String baseUrl){
		PortfolioPlayerMaster portfolioPlayerMaster = getPortfolioPlayerMasterDetail(userId);
		PortfolioHomeMaster portfolioHomeMaster = getPortfolioHomeMasterDetail(userId);
		PortfolioAboutMeMaster portfolioAboutMeMaster = getPortfolioAboutMeMasterDetail(userId);
		UserBasicInfoDetail userBasicInfoDetail = new UserBasicInfoDetail();
		userBasicInfoDetail.setUserName(portfolioPlayerMaster.getUserName());
		userBasicInfoDetail.setFirstName(portfolioPlayerMaster.getFirstName());
		userBasicInfoDetail.setLastName(portfolioPlayerMaster.getLastName());
		userBasicInfoDetail.setAvatarImage(baseUrl+"home/"+portfolioHomeMaster.getAvatarImageName());
		userBasicInfoDetail.setTagLine(portfolioHomeMaster.getTagLine());
		userBasicInfoDetail.setMobileNumber(portfolioPlayerMaster.getMobile());
		userBasicInfoDetail.setEmail(portfolioPlayerMaster.getEmailId());
		userBasicInfoDetail.setAddress(portfolioPlayerMaster.getAddress());
		userBasicInfoDetail.setAboutMe(portfolioAboutMeMaster.getAboutMe());
		userBasicInfoDetail.setIsAdmin(portfolioPlayerMaster.getIsAdmin());
		return userBasicInfoDetail;
	}
	
	public List<AboutMeSubMasterDetail> getAboutMeSubMasterDetail(Integer commonId, String baseUrl){
		List<PortfolioAboutMeSubMaster> listPortfolioAboutMeSubMaster = getPortfolioAboutMeSubMasterDetail(commonId);
		List<AboutMeSubMasterDetail> aboutMeSubMasterDetailList = new ArrayList<AboutMeSubMasterDetail>();
		for(PortfolioAboutMeSubMaster bean:listPortfolioAboutMeSubMaster){
			AboutMeSubMasterDetail aboutMeSubMasterDetail = new AboutMeSubMasterDetail();
			aboutMeSubMasterDetail.setMenu(bean.getMenu());
			aboutMeSubMasterDetail.setHeading(bean.getHeading());
			aboutMeSubMasterDetail.setDescription(bean.getDescription());
			aboutMeSubMasterDetail.setImage(baseUrl+"aboutme/"+bean.getImageName());
			aboutMeSubMasterDetailList.add(aboutMeSubMasterDetail);
		}
		return aboutMeSubMasterDetailList;
	}
	
	public List<WorkExperienceDetail> getWorkExperienceDetail(Integer userId){
		List<PortfolioWorkexpMaster> listPortfolioWorkexpMaster = getPortfolioWorkexpMasterDetail(userId);
		List<WorkExperienceDetail> workExperienceDetailList = new ArrayList<WorkExperienceDetail>();
		for (PortfolioWorkexpMaster bean : listPortfolioWorkexpMaster) {
			WorkExperienceDetail workExperienceDetail = new WorkExperienceDetail();
			workExperienceDetail.setCompanyDetail(bean.getCompanyName());
			workExperienceDetail.setDesignation(bean.getDesignation());
			workExperienceDetail.setDescription(bean.getDescription());
			workExperienceDetail.setJoiningDate(bean.getJoiningDate());
			workExperienceDetailList.add(workExperienceDetail);
		}
		return workExperienceDetailList;
	}
	
	public List<EducationDetail> getEducationDetail(Integer userId){
		List<PortfolioEducationMaster> listPortfolioEducationMaster = getPortfolioEducationMasterDetail(userId);
		List<EducationDetail> educationDetailList = new ArrayList<EducationDetail>();
		for (PortfolioEducationMaster bean : listPortfolioEducationMaster) {
			EducationDetail educationDetail = new EducationDetail();
			educationDetail.setSchoolName(bean.getSchoolName());
			educationDetail.setDomain(bean.getDomain());
			educationDetail.setDescription(bean.getDescription());
			educationDetail.setPassingYear(bean.getYearOfPassing());
			educationDetailList.add(educationDetail);
		}
		return educationDetailList;
		}
	
	public List<SkillDetail> getSkillDetail(Integer userId) {
		List<PortfolioSkillMaster> listPortfolioSkillMaster = getPortfolioSkillMasterDetail(userId);
		List<SkillDetail> skillDetailList = new ArrayList<SkillDetail>();
		for (PortfolioSkillMaster bean : listPortfolioSkillMaster) {
			SkillDetail skillDetail = new SkillDetail();
			skillDetail.setSkillCategory(bean.getSkillCategory());
			skillDetail.setMarks(bean.getMarks());
			skillDetailList.add(skillDetail);
		}
		return skillDetailList;
	}
}
