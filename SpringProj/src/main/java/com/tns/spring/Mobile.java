package com.tns.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Sim s1=c.getBean("s1",Airtel.class);
		Sim s2 = c.getBean("s2",Jio.class);
		s1.calling();
		s1.data();
		s2.calling();
		s2.data();
      
	}

}
