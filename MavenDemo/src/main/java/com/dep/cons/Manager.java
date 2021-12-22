package com.dep.cons;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Emp {
Acct ac;
	

	public Manager(Acct ac) {
	super();
	System.out.println("manager constructor");
	this.ac = ac;
	
}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("manager");

	}

	@Override
	public void jobDetails() {
		// TODO Auto-generated method stub
		System.out.println("manage their employees");

	}
	
	public void callMeeting() {
		ac.doWork();
		ac.jobDetails();
		
	}

}
