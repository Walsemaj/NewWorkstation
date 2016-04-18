package com.test.testSpringHibernate.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.testSpringHibernate.product.bo.ProductBo;
import com.test.testSpringHibernate.product.model.Product;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		Product product = new Product("ABC", "This is product ABC");
		
		ProductBo productBo = (ProductBo) appContext.getBean("productBoProxy");
		
		productBo.save(product, 100);
		
		System.out.println(productBo.find(product.getProductId()));
	}
}
