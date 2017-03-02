package com.portfolio.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.portfolio.bean.SignUpBean;
import com.portfolio.mapping.PortfolioAboutMeMaster;
import com.portfolio.mapping.PortfolioAboutMeSubMaster;
import com.portfolio.mapping.PortfolioEducationMaster;
import com.portfolio.mapping.PortfolioHomeMaster;
import com.portfolio.mapping.PortfolioPlayerMaster;
import com.portfolio.mapping.PortfolioPropertyMaster;
import com.portfolio.mapping.PortfolioSkillMaster;
import com.portfolio.mapping.PortfolioWorkexpMaster;

@Entity
public class SignUpMgmtDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public String saveSignUpInfo(SignUpBean bean){

		Session session = sessionFactory.openSession();
		PortfolioPlayerMaster portfolioPlayerMaster = new PortfolioPlayerMaster();
		//portfolioPlayerMaster.setUserName(bean.getUserName());
		portfolioPlayerMaster.setEmailId(bean.getEmailAddress());
		portfolioPlayerMaster.setGender(bean.getSex());
		portfolioPlayerMaster.setPassword(bean.getPassword());
		portfolioPlayerMaster.setMobile(bean.getPhoneNo());
		portfolioPlayerMaster.setAcessId((bean.getEmailAddress()+System.currentTimeMillis()));
		portfolioPlayerMaster.setStatus("INACTIVE");
		session.save(portfolioPlayerMaster);
		session.flush();
		session.close();
		return "SUCCESS";
	}
	
	public PortfolioHomeMaster getUserHomeInfo(Integer userId){
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioHomeMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		List<PortfolioHomeMaster> list = criteria.list();
		session.close();
		if(list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	
	public Map<String,PortfolioPropertyMaster> getPropertyMaster(){
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPropertyMaster.class);
		Map<String,PortfolioPropertyMaster> map = new HashMap<String,PortfolioPropertyMaster>();
		List<PortfolioPropertyMaster> list = criteria.list();
		session.close();
		for(PortfolioPropertyMaster portfolioPropertyMaster : list){
			map.put(portfolioPropertyMaster.getPropertyCode(), portfolioPropertyMaster);
		}
		return map;
	}
	
	public PortfolioPropertyMaster getPropertyMasterByPropertyName(String propertyCode){
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPropertyMaster.class);
		criteria.add(Restrictions.eq("propertyCode", propertyCode));
		List<PortfolioPropertyMaster> list = criteria.list();
		session.close();
		return list.get(0);
	}
	
	public PortfolioAboutMeMaster getUserAboutMeInfo(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioAboutMeMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		List<PortfolioAboutMeMaster> list = criteria.list();
		session.close();
		if(list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	
	public List<PortfolioAboutMeSubMaster> getSubUserAboutMeInfo(Integer commonId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioAboutMeSubMaster.class);
		criteria.add(Restrictions.eq("commonId", commonId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		List<PortfolioAboutMeSubMaster> list = criteria.list();
		return list;
	}
	
	public List<PortfolioWorkexpMaster> getUserWorkExp(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioWorkexpMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		List<PortfolioWorkexpMaster> list = criteria.list();
		session.close();
		return list;
	}
	
	public List<PortfolioEducationMaster> getUserEducation(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioEducationMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		List<PortfolioEducationMaster> list = criteria.list();
		session.close();
		return list;
	}
	
	public List<PortfolioSkillMaster> getUserSkillInfo(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioSkillMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		List<PortfolioSkillMaster> list = criteria.list();
		session.close();
		return list;
	}

	public PortfolioPlayerMaster getPlayerMaster(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPlayerMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		List<PortfolioPlayerMaster> list = criteria.list();
		session.close();
		return list.get(0);
	}
	
	public PortfolioPlayerMaster getPlayerMasterInfo(String acessId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPlayerMaster.class);
		criteria.add(Restrictions.eq("acessId", acessId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		System.out.println("criteria = " + criteria.list());
		PortfolioPlayerMaster portfolioPlayerMaster = (PortfolioPlayerMaster) criteria.list().get(0);
		session.close();
		return portfolioPlayerMaster;
	}
	
	public String getPlayerAcessId(SignUpBean signUpBean) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPlayerMaster.class);
		criteria.add(Restrictions.eq("emailId", signUpBean.getEmailAddress()));
		criteria.add(Restrictions.eq("mobile", signUpBean.getPhoneNo()));
		PortfolioPlayerMaster portfolioPlayerMaster = (PortfolioPlayerMaster) criteria.list().get(0);
		return portfolioPlayerMaster.getAcessId();
	}
	

	public Integer getAboutMeSubMasterCommonIdByUserId(Integer userId) {
		Session session=sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioAboutMeMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		return ((PortfolioAboutMeMaster) criteria.list().get(0)).getSubMasterCommonId();
	}
}
