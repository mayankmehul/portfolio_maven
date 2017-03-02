package com.portfolio.dao;


import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.portfolio.bean.SignUpForm1;
import com.portfolio.bean.SignUpForm2;
import com.portfolio.bean.SignUpForm3;
import com.portfolio.mapping.PortfolioAboutMeMaster;
import com.portfolio.mapping.PortfolioAboutMeSubMaster;
import com.portfolio.mapping.PortfolioEducationMaster;
import com.portfolio.mapping.PortfolioHomeMaster;
import com.portfolio.mapping.PortfolioPlayerMaster;
import com.portfolio.mapping.PortfolioSkillMaster;
import com.portfolio.mapping.PortfolioWorkexpMaster;

@Entity
public class CreateProfileMgmtDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean checkIfUsernameExist(String userName) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPlayerMaster.class);
		criteria.add(Restrictions.eq("userName", userName));
		if(criteria.list().size()>0) return false;
		return true;
	}
	
	public boolean checkIfEmailExist(String email) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPlayerMaster.class);
		criteria.add(Restrictions.eq("emailId", email));
		if(criteria.list().size()>0) return false;
		return true;
	}
	
	public boolean checkIfContactNumberExist(String contactNumber) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPlayerMaster.class);
		criteria.add(Restrictions.eq("mobile", contactNumber));
		if(criteria.list().size()>0) return false;
		return true;
	}
	
	public Integer getPlayerMasterUserId(String acessId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPlayerMaster.class);
		criteria.add(Restrictions.eq("acessId", acessId));
		if(criteria.list().size()>0)
			return ((PortfolioPlayerMaster) criteria.list().get(0)).getUserId();
		return 0;
	}
	
	public Integer getPlayerAboutMeCommonId(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioAboutMeMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		if(criteria.list().size()>0)
			return ((PortfolioAboutMeMaster) criteria.list().get(0)).getSubMasterCommonId();
		return 0;
	}
	
	public List<PortfolioAboutMeSubMaster> getPortfolioAboutMeSubMasterDetail(Integer commonId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioAboutMeSubMaster.class);
		criteria.add(Restrictions.eq("commonId", commonId));
		List<PortfolioAboutMeSubMaster> list = criteria.list();
		return list;
	}
	
	public String addNewUserPortfolioPlayerMasterInfo(SignUpForm1 signUpForm1) {
		String acessId = signUpForm1.getEmailAddress()+"_"+System.currentTimeMillis();
		System.out.println("acessId ----------------->>>>>>>>>>>>>>>>>>>>>>>>>> " + acessId);
		Session session = sessionFactory.openSession();
		
		PortfolioPlayerMaster portfolioPlayerMaster = new PortfolioPlayerMaster();
		portfolioPlayerMaster.setUserName(signUpForm1.getUserName());
		portfolioPlayerMaster.setFirstName(signUpForm1.getFirstName());
		portfolioPlayerMaster.setLastName(signUpForm1.getLastName());
		portfolioPlayerMaster.setPassword(signUpForm1.getPassword());
		//portfolioPlayerMaster.setRegistrationDate((Timestamp) new Date());
		portfolioPlayerMaster.setMobile(signUpForm1.getPhoneNumber());
		portfolioPlayerMaster.setEmailId(signUpForm1.getEmailAddress());
		portfolioPlayerMaster.setAddress(signUpForm1.getCurrentAddress());
		portfolioPlayerMaster.setGender(signUpForm1.getSex());
		portfolioPlayerMaster.setAcessId(signUpForm1.getAcessId());
		portfolioPlayerMaster.setStatus("ACTIVE");
		portfolioPlayerMaster.setIsAdmin(false);
		session.save(portfolioPlayerMaster);
		session.flush();
		session.close();
		return "SUCCESS";
	}
	
	public String addNewUserPortfolioHomeMasterInfo(SignUpForm1 signUpForm1, Integer userId) {
		Session session = sessionFactory.openSession();
		PortfolioHomeMaster portfolioHomeMaster = new PortfolioHomeMaster();
		portfolioHomeMaster.setUserId(userId);
		portfolioHomeMaster.setTagLine(signUpForm1.getTagLine());
		portfolioHomeMaster.setAvatarImageName(signUpForm1.getProfileImage().getOriginalFilename());
		portfolioHomeMaster.setHomeImageName(signUpForm1.getBgImage().getOriginalFilename());
		session.save(portfolioHomeMaster);
		session.flush();
		session.close();
		return "SUCCESS";
	}
	
	public String addNewUserPortfolioAboutMeMasterInfo(String aboutMe, Integer userId) {
		Session session = sessionFactory.openSession();
		PortfolioAboutMeMaster portfolioAboutMeMaster = new PortfolioAboutMeMaster();
		portfolioAboutMeMaster.setUserId(userId);
		portfolioAboutMeMaster.setAboutMe(aboutMe);
		portfolioAboutMeMaster.setSubMasterCommonId(userId);
		session.save(portfolioAboutMeMaster);
		session.flush();
		session.close();
		return "SUCCESS";
	}
	
	public String addNewUserPortfolioAboutMeSubMasterInfo(SignUpForm2 signUpForm2, Integer commonId) {
		Session session = sessionFactory.openSession();
		for(int i =0;i<signUpForm2.getHeadingAboutMe().size();i++){
			PortfolioAboutMeSubMaster portfolioAboutMeSubMaster = new PortfolioAboutMeSubMaster();
			portfolioAboutMeSubMaster.setCommonId(commonId);
			portfolioAboutMeSubMaster.setMenu("Doing");
			portfolioAboutMeSubMaster.setHeading(signUpForm2.getHeadingAboutMe().get(i));
			portfolioAboutMeSubMaster.setDescription(signUpForm2.getDescriptionAboutMe().get(i));
			portfolioAboutMeSubMaster.setImageName(signUpForm2.getImageAboutMe().get(i).getOriginalFilename());
			portfolioAboutMeSubMaster.setStatus("ACTIVE");
			session.save(portfolioAboutMeSubMaster);
		}
		for(int i =0;i<signUpForm2.getHeadingFunFact().size();i++){
			PortfolioAboutMeSubMaster portfolioAboutMeSubMaster = new PortfolioAboutMeSubMaster();
			portfolioAboutMeSubMaster.setCommonId(commonId);
			portfolioAboutMeSubMaster.setMenu("FunFact");
			portfolioAboutMeSubMaster.setHeading(signUpForm2.getHeadingFunFact().get(i));
			portfolioAboutMeSubMaster.setDescription(signUpForm2.getDescriptionFunFact().get(i));
			portfolioAboutMeSubMaster.setImageName(signUpForm2.getImageFunFact().get(i).getOriginalFilename());
			portfolioAboutMeSubMaster.setStatus("ACTIVE");
			session.save(portfolioAboutMeSubMaster);
		}
		for(int i =0;i<signUpForm2.getHeadingWorkProcess().size();i++){
			PortfolioAboutMeSubMaster portfolioAboutMeSubMaster = new PortfolioAboutMeSubMaster();
			portfolioAboutMeSubMaster.setCommonId(commonId);
			portfolioAboutMeSubMaster.setMenu("WorkProgress");
			portfolioAboutMeSubMaster.setHeading(signUpForm2.getHeadingWorkProcess().get(i));
			portfolioAboutMeSubMaster.setDescription(signUpForm2.getDescriptionWorkProcess().get(i));
			portfolioAboutMeSubMaster.setImageName(signUpForm2.getImageWorkProcess().get(i).getOriginalFilename());
			portfolioAboutMeSubMaster.setStatus("ACTIVE");
			session.save(portfolioAboutMeSubMaster);
		}
		session.flush();
		session.close();
		return "SUCCESS";
	}
	
	public String addNewUserPortfolioEducationMasterInfo(SignUpForm3 signUpForm3, Integer userId) {
		Session session = sessionFactory.openSession();
		for(int i=0;i<signUpForm3.getSchoolUniversityName().size();i++){
			PortfolioEducationMaster portfolioEducationMaster = new PortfolioEducationMaster();
			portfolioEducationMaster.setUserId(userId);
			portfolioEducationMaster.setSchoolName(signUpForm3.getSchoolUniversityName().get(i));
			portfolioEducationMaster.setUniversityName(signUpForm3.getSchoolUniversityName().get(i));
			portfolioEducationMaster.setAddress(signUpForm3.getSchoolUniversityAddress().get(i));
			portfolioEducationMaster.setDomain(signUpForm3.getSubject().get(i));
			portfolioEducationMaster.setPercentage(signUpForm3.getPercentage().get(i));
			portfolioEducationMaster.setYearOfPassing(signUpForm3.getPassingYear().get(i));
			portfolioEducationMaster.setDescription(signUpForm3.getDiscriptionSubject().get(i));
			portfolioEducationMaster.setStatus("ACTIVE");
			session.save(portfolioEducationMaster);
		}
		session.flush();
		session.close();
		return "SUCCESS";
	}
	
	public String addNewUserPortfolioSkillMasterInfo(SignUpForm3 signUpForm3, Integer userId) {
		Session session = sessionFactory.openSession();
		for(int i=0;i<signUpForm3.getYourSkill().size();i++){
			PortfolioSkillMaster portfolioSkillMaster = new PortfolioSkillMaster();
			portfolioSkillMaster.setUserId(userId);
			portfolioSkillMaster.setSkillCategory(signUpForm3.getYourSkill().get(i));
			portfolioSkillMaster.setMarks(signUpForm3.getSkillWeightage().get(i));
			portfolioSkillMaster.setStatus("ACTIVE");
			session.save(portfolioSkillMaster);
		}
		session.flush();
		session.close();
		return "SUCCESS";
	}
	
	public String addNewUserPortfolioWorkexpMasterInfo(SignUpForm3 signUpForm3, Integer userId) {
		Session session = sessionFactory.openSession();
		for(int i=0;i<signUpForm3.getCompanyName().size();i++){
			PortfolioWorkexpMaster portfolioWorkexpMaster = new PortfolioWorkexpMaster();
			portfolioWorkexpMaster.setUserId(userId);
			portfolioWorkexpMaster.setCompanyName(signUpForm3.getCompanyName().get(i));
			portfolioWorkexpMaster.setDesignation(signUpForm3.getDesignation().get(i));
			portfolioWorkexpMaster.setTechnologies(signUpForm3.getSkills().get(i));
			portfolioWorkexpMaster.setComanyAddress(signUpForm3.getCompanyAddress().get(i));
			portfolioWorkexpMaster.setDescription(signUpForm3.getDescriptionCompany().get(i));
			portfolioWorkexpMaster.setJoiningDate(signUpForm3.getStartDate().get(i));
			portfolioWorkexpMaster.setEndDate(signUpForm3.getEndDate().get(i));
			portfolioWorkexpMaster.setStatus("ACTIVE");
			session.save(portfolioWorkexpMaster);
		}
		session.flush();
		session.close();
		return "SUCCESS";
	}
}
