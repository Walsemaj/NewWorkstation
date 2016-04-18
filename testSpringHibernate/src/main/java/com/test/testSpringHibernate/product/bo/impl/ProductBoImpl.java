package com.test.testSpringHibernate.product.bo.impl;

import com.test.testSpringHibernate.product.bo.ProductBo;
import com.test.testSpringHibernate.product.dao.ProductDao;
import com.test.testSpringHibernate.product.dao.ProductQohDao;
import com.test.testSpringHibernate.product.model.Product;
import com.test.testSpringHibernate.product.model.ProductQoh;

public class ProductBoImpl implements ProductBo {
	ProductDao productDao;
	ProductQohDao productQohDao;
	
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void setProductQohDao(ProductQohDao productQohDao) {
		this.productQohDao = productQohDao;
	}

	@Override
	public void save(Product product, int qoh) {

		productDao.save(product);
				
		ProductQoh productQoh = new ProductQoh(product.getProductId(), qoh);
		
		productQohDao.save(productQoh);
		
//		this.delete(product, productQoh);
	}
	
	public void delete(Product product, ProductQoh productQoh) {
		productQohDao.delete(productQoh);
		productDao.delete(product);
	}
	
	public Product find(long id) {
		return productDao.find(id);
	}
}
