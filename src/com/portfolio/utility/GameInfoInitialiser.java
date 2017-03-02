package com.portfolio.utility;

import java.io.IOException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.portfolio.service.SignUpMgmtService;

@Entity
public class GameInfoInitialiser extends GenericServlet {
	@Id
	@GeneratedValue
	private static final long serialVersionUID = -2459053297167640292L;
	@ManyToOne
	private SignUpMgmtService signUpMgmtService;
	SessionFactory sessionFactory;
	@Autowired
	ApplicationContext context;
	
	public void init(ServletConfig servletConfig) throws ServletException {
		super.init(servletConfig);
		signUpMgmtService = (SignUpMgmtService)context.getBean("signUpMgmtService");
		String serverPath = servletConfig.getServletContext().getRealPath("\\");
		try {
			
			setSignUpMgmtService(new SignUpMgmtService());
			setProperties();		
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("---Session Factory Error---");
			System.exit(0);
		}
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	public void setProperties(){
		Utility.PortfolioPropertyMaster = signUpMgmtService.getPropertyMaster();
	}

	public SignUpMgmtService getSignUpMgmtService() {
		return signUpMgmtService;
	}

	public void setSignUpMgmtService(SignUpMgmtService signUpMgmtService) {
		this.signUpMgmtService = signUpMgmtService;
	}
}
