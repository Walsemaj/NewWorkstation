package com.test.testSpringHibernateAOP.customer.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CustomerMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("Interceptor: Started");
 
		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();
 
			// same with AfterReturningAdvice
			System.out.println("HijackAroundMethod : Before after hijacked!");
 
			return result;
 
		} catch (IllegalArgumentException e) {
			throw e;
		}
		finally{
			System.out.println("Interceptor: Ended");
		}
	}
	
}
