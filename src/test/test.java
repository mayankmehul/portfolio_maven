package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.portfolio.bean.SignUpBean;

public class test {
	public static void main(String args[]){
		ApplicationContext ac = new ClassPathXmlApplicationContext("file:resource/Spring-Config.xml");
		SignUpBean lb = (SignUpBean) ac.getBean("login");
		System.out.println(lb.getEmailAddress());
	}
}
