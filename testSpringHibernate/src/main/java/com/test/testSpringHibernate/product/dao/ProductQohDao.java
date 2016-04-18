package com.test.testSpringHibernate.product.dao;

import com.test.testSpringHibernate.product.model.ProductQoh;

public interface ProductQohDao {
	
	void save(ProductQoh productQoh);
	void delete(ProductQoh productQoh);
	ProductQoh find(long id);
}
