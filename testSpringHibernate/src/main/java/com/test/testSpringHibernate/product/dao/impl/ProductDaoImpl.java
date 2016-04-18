package com.test.testSpringHibernate.product.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.testSpringHibernate.product.dao.ProductDao;
import com.test.testSpringHibernate.product.model.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {
	public void save(Product product) {
		this.getHibernateTemplate().save(product);
	}
	
	public void delete(Product product) {
		((String)null).equals(""); //Throw exception to test about Spring transaction
		this.getHibernateTemplate().delete(product);
	}
	
	public Product find(long id) {
		return (Product)this.getHibernateTemplate().get(Product.class, id);
	}
}
