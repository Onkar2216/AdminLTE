package com.javabykiran.logger;


import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	
	
	public LoggerAspect() 
	{
		System.out.println("I am in login aspect");
	}
	
	Date date=new Date();
	@SuppressWarnings("deprecation")
	long starttime1=date.getSeconds();
	
	
	@Before("execution(* com.javabykiran.*..*Controller())")
	public void logServicemetodsBef6(JoinPoint joinpoint) {
		//time should print here
		//int starttime -- millisecond... 
		System.out.println("Start Time >> "+starttime1);
		System.out.println("entering into method  >>>" + joinpoint.getSignature().getName()+" At "+date.toString());
	}

	@SuppressWarnings("deprecation")
	@After("execution(* com.javabykiran.*..*Controller())")
	public void logServicemetodsAft6(JoinPoint joinpoint) {
		long currenttime=date.getSeconds();
		long endtime=starttime1-currenttime;
		System.out.println("End Time >> "+currenttime);
		System.out.println("Time Taken By "+joinpoint.getSignature().getName() +" Method >> "+endtime);
		System.out.println("exiting into method  >>> " + joinpoint.getSignature().getName()+" At "+date.toString());
	}
	
	@Before("execution(* com.javabykiran.*..*Controller(*))")
	public void logServicemetodsBef7(JoinPoint joinpoint) {
		System.out.println("Start Time >> "+starttime1);
		System.out.println("entering into method  >>>" + joinpoint.getSignature().getName());
	}

	@SuppressWarnings("deprecation")
	@After("execution(* com.javabykiran.*..*Controller(*))")
	public void logServicemetodsAft7(JoinPoint joinpoint) {
		long currenttime=date.getSeconds();
		long endtime=starttime1-currenttime;
		System.out.println("End Time >> "+currenttime);
		System.out.println("Time Taken By "+joinpoint.getSignature().getName() +" Method >> "+endtime);
		System.out.println("exiting into method  >>> " + joinpoint.getSignature().getName()+" At "+date.toString());
	}
	
	@Before("execution(* com.javabykiran.*..*Controller(**))")
	public void logServicemetodsBef8(JoinPoint joinpoint) {
		System.out.println("Start Time >> "+starttime1);
		System.out.println("entering into method  >>>" + joinpoint.getSignature().getName());
	}

	@SuppressWarnings("deprecation")
	@After("execution(* com.javabykiran.*..*Controller(**))")
	public void logServicemetodsAft8(JoinPoint joinpoint) {
		long currenttime=date.getSeconds();
		long endtime=starttime1-currenttime;
		System.out.println("End Time >> "+currenttime);
		System.out.println("Time Taken By "+joinpoint.getSignature().getName() +" Method >> "+endtime);
		System.out.println("exiting into method  >>> " + joinpoint.getSignature().getName()+" At "+date.toString());
	}

	@Before("execution(* com.javabykiran.*..get*())")
	public void logServicemetodsBef5(JoinPoint joinpoint) {
		System.out.println("Start Time >> "+starttime1);
		System.out.println("entering into method  >>> " + joinpoint.getSignature().getName()+" At "+date.toString());
	}

	@SuppressWarnings("deprecation")
	@After("execution(* com.javabykiran.*..get*())")
	public void logServicemetodsAft5(JoinPoint joinpoint) {
		long currenttime=date.getSeconds();
		long endtime=starttime1-currenttime;
		System.out.println("End Time >> "+currenttime);
		System.out.println("Time Taken By "+joinpoint.getSignature().getName() +" Method >> "+endtime);
		System.out.println("exiting into method  >>> " + joinpoint.getSignature().getName()+" At "+date.toString());
	}
	
	@Before("execution(* com.javabykiran.*..check*(**))")
	public void logServicemetodsBef(JoinPoint joinpoint) 
	{
		System.out.println("Start Time >> "+starttime1);
		System.out.println("entering into method  >>>" + joinpoint.getSignature().getName()+" At "+date.toString());
	}

	@SuppressWarnings("deprecation")
	@After("execution(* com.javabykiran.*..check*(**))")
	public void logServicemetodsAft(JoinPoint joinpoint) {
		long currenttime=date.getSeconds();
		long endtime=starttime1-currenttime;
		System.out.println("End Time >> "+currenttime);
		System.out.println("Time Taken By "+joinpoint.getSignature().getName() +" Method >> "+endtime);
		System.out.println("exiting into method  >>> " + joinpoint.getSignature().getName()+" At "+date.toString());
	}
	

	@Before("execution(* com.javabykiran.*..check*(*))")
	public void logServicemetodsBef1(JoinPoint joinpoint) {
		System.out.println("Start Time >> "+starttime1);
		System.out.println("entering into method  >>>" + joinpoint.getSignature().getName()+" At "+date.toString());	
	}

	@SuppressWarnings("deprecation")
	@After("execution(* com.javabykiran.*..check*(*))")
	public void logServicemetodsAft1(JoinPoint joinpoint) {
		long currenttime=date.getSeconds();
		long endtime=starttime1-currenttime;
		System.out.println("End Time >> "+currenttime);
		System.out.println("Time Taken By "+joinpoint.getSignature().getName() +" Method >> "+endtime);
		System.out.println("exiting into method  >>> " + joinpoint.getSignature().getName()+" At "+date.toString());
	}
	
	@Before("execution(* com.javabykiran.*..get*(*))")
	public void logServicemetodsBef4(JoinPoint joinpoint) {
		System.out.println("Start Time >> "+starttime1);
		System.out.println("entering into method  >>>" + joinpoint.getSignature().getName()+" At "+date.toString());
	}
	
	@SuppressWarnings("deprecation")
	@After("execution(* com.javabykiran.*..get*(*))")
	public void logServicemetodsAft3(JoinPoint joinpoint) {
		long currenttime=date.getSeconds();
		long endtime=starttime1-currenttime;
		System.out.println("End Time >> "+currenttime);
		System.out.println("Time Taken By "+joinpoint.getSignature().getName() +" Method >> "+endtime);
		System.out.println("exiting into method  >>> " + joinpoint.getSignature().getName()+" At "+date.toString());
	}
}
