package com.dep.cons;

import org.springframework.stereotype.Component;

@Component
public class Acct implements Emp {

	public Acct() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("inside the act const");
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("acctountant");

	}

	@Override
	public void jobDetails() {
		// TODO Auto-generated method stub
		System.out.println("acctountant handle all accounance");

	}

}
