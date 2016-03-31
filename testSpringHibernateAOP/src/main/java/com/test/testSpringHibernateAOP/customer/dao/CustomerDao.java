package com.test.testSpringHibernateAOP.customer.dao;

import com.test.testSpringHibernateAOP.customer.model.Customer;

public interface CustomerDao {
	void save(Customer customer);
	Customer find(long id);
	void testThrowsAdvice() throws Exception;
}
