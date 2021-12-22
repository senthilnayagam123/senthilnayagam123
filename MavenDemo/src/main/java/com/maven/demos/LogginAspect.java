package com.maven.demos;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("execution(* com.maven.demo1.CustomerBo.addCustomer())")
	public void logBefore(JoinPoint join) {
		System.out.println(" Lofbefore is running ");
		System.out.println("Hijacked "+ join.getSignature().getName());
		System.out.println("*****");
	}

	
	@After("execution (* com.maven.demo1.CustomerBo.addCustomer())")
	public void logAfter(JoinPoint jo) {
		System.out.println(" LofAfter is running ");
		System.out.println("Hijacked "+ jo.getSignature().getName());
		System.out.println("*****");
	}
	
	@Around("execution (* com.maven.demo1.CustomerBo.addCustomer())")
	public void logAround(JoinPoint joi) {
		System.out.println(" LofAround is running ");
		System.out.println("Hijacked "+ joi.getSignature().getName());
		System.out.println("*****");
	}
}