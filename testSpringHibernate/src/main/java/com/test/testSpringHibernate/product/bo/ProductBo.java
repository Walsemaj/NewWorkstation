package com.test.testSpringHibernate.product.bo;

import com.test.testSpringHibernate.product.model.Product;
import com.test.testSpringHibernate.product.model.ProductQoh;

public interface ProductBo {
	
	public void save(Product product, int qoh);
	public void delete(Product product, ProductQoh productQoh);
	public Product find(long id);
}
