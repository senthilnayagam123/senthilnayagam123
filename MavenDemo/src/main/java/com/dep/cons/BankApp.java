package com.dep.cons;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext c =new AnnotationConfigApplicationContext(AppConfig.class);
		Manager m = c.getBean(Manager.class);
		m.callMeeting();
		c.close();

	}

}
