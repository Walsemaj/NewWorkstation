package com.test.testSpringHibernateAOP.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.testSpringHibernateAOP.customer.dao.CustomerDao;
import com.test.testSpringHibernateAOP.customer.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	if(args.length < 1) 
    	{
    		System.out.println("Except parameters: [PatternMethodPointcutAdvisor | ClassIntercepted | NameMatchMethodPointcut]"); 
    		return;
    	}
//        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations_MethodPointcutAdvisor.xml");
//        ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations_ClassIntercepted.xml");
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations_" + args[0] + ".xml");
    	
        CustomerDao customerDao = (CustomerDao)appContext.getBean("customerDaoProxy");
        Customer cust = new Customer("Cotton", 3);
        customerDao.save(cust);
        System.out.println(cust.getCustId());
        System.out.println(customerDao.find(1));
        
        try {
			customerDao.testThrowsAdvice();
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
}
