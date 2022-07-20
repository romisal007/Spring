package com.rohit.spring.spingaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.rohit.spring.spingaop.ProductServiceImpl.multiply(..))")
	public void logbBefore(JoinPoint joinpoint) {

		System.out.println("Before calling the method");
	}

	@After("execution(* com.rohit.spring.spingaop.ProductServiceImpl.multiply(..))")
	public void lofafter(JoinPoint joinpoint) {
		System.out.println("After the methos Invokation");
	}
}
