package com.portfolio.dao;

import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.portfolio.mapping.PortfolioAboutMeMaster;
import com.portfolio.mapping.PortfolioAboutMeSubMaster;
import com.portfolio.mapping.PortfolioEducationMaster;
import com.portfolio.mapping.PortfolioHomeMaster;
import com.portfolio.mapping.PortfolioPlayerMaster;
import com.portfolio.mapping.PortfolioSkillMaster;
import com.portfolio.mapping.PortfolioWorkexpMaster;

@Entity
public class UserDetailMgmtDao {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public PortfolioPlayerMaster getPortfolioPlayerMasterDetail(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioPlayerMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		PortfolioPlayerMaster portfolioPlayerMaster = (PortfolioPlayerMaster) criteria.list().get(0);
		session.flush();
		session.close();
		return portfolioPlayerMaster;
	}

	public PortfolioHomeMaster getPortfolioHomeMasterDetail(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioHomeMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		PortfolioHomeMaster portfolioHomeMaster = (PortfolioHomeMaster) criteria.list().get(0);
		session.flush();
		session.close();
		return portfolioHomeMaster;
	}
	
	public PortfolioAboutMeMaster getPortfolioAboutMeMasterDetail(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioAboutMeMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		PortfolioAboutMeMaster portfolioAboutMeMaster = (PortfolioAboutMeMaster) criteria.list().get(0);
		session.flush();
		session.close();
		return portfolioAboutMeMaster;
	}

	public List<PortfolioAboutMeSubMaster> getPortfolioAboutMeSubMasterDetail(
			Integer commonId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioAboutMeSubMaster.class);
		criteria.add(Restrictions.eq("commonId", commonId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		List<PortfolioAboutMeSubMaster> list = criteria.list();
		session.flush();
		session.close();
		return list;
	}
	
	public List<PortfolioEducationMaster> getPortfolioEducationMasterDetail(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioEducationMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		List<PortfolioEducationMaster> list = criteria.list();
		session.flush();
		session.close();
		return list;
	}
	public List<PortfolioSkillMaster> getPortfolioSkillMasterDetail(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioSkillMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		List<PortfolioSkillMaster> list = criteria.list();
		session.flush();
		session.close();
		return list;
	}
	public List<PortfolioWorkexpMaster> getPortfolioWorkexpMasterDetail(Integer userId) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(PortfolioWorkexpMaster.class);
		criteria.add(Restrictions.eq("userId", userId));
		criteria.add(Restrictions.eq("status", "ACTIVE"));
		List<PortfolioWorkexpMaster> list = criteria.list();
		session.flush();
		session.close();
		return list;
	}
	
}
