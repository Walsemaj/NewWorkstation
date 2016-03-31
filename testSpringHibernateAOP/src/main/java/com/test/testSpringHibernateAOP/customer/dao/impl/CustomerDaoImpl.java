package com.test.testSpringHibernateAOP.customer.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.testSpringHibernateAOP.customer.dao.CustomerDao;
import com.test.testSpringHibernateAOP.customer.model.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void save(Customer customer) {
		this.getHibernateTemplate().save(customer);
	}

	@Override
	public Customer find(long id) {
		return (Customer) this.getHibernateTemplate().get(Customer.class, id);
	}
	
	public void testThrowsAdvice() throws Exception {
		System.out.println("___Only [ClassIntercepted] setup has implemented the ThrowsAdvice___");
		((String)null).equals(""); 
	}
}
