package com.test.testSpringHibernate.product.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.testSpringHibernate.product.dao.ProductQohDao;
import com.test.testSpringHibernate.product.model.ProductQoh;

public class ProductQohDaoImpl extends HibernateDaoSupport implements ProductQohDao {
	public void save(ProductQoh productQoh) {
//		((String)null).equals(""); //Throw exception to test about Spring transaction 
		this.getHibernateTemplate().save(productQoh);
	}
	
	public void delete(ProductQoh productQoh) {
		this.getHibernateTemplate().delete(productQoh);
	}
	
	public ProductQoh find(long id) {
		return (ProductQoh) this.getHibernateTemplate().get(ProductQoh.class, id);
	}
}
