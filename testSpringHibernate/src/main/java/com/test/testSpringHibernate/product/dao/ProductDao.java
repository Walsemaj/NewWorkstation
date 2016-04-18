package com.test.testSpringHibernate.product.dao;

import com.test.testSpringHibernate.product.model.Product;

public interface ProductDao {
	
	void save(Product product);
	void delete(Product product);
	Product find(long id);
}
