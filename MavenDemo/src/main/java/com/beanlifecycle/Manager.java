package com.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Manager implements Employee, InitializingBean, DisposableBean {

	@Override
	public void job() {
		// TODO Auto-generated method stub
		System.out.println("Manager");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Perform task while initilizing Bean");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("perform tasks while destroying Bean");
		
	}

}
