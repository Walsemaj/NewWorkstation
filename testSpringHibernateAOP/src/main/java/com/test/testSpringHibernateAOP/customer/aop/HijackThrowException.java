package com.test.testSpringHibernateAOP.customer.aop;

import org.springframework.aop.ThrowsAdvice;

public class HijackThrowException implements ThrowsAdvice {
	public void afterThrowing(Exception e) throws Throwable {
		System.out.println("#####################          Throw exception hijacked!             #####################");
		System.out.println("#####################    Exception from target class can be caught   #####################");
	}
}
