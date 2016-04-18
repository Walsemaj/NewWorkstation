package com.test.testSpringHibernate.product.model;

public class Product implements java.io.Serializable { 
	/**
	 * 
	 */
	private static final long serialVersionUID = -6038114763129537221L;
	private long productId;
	private String productCode;
	private String productDesc;

	public Product() {
		
	}
	
	public Product(String productCode, String productDesc) {
		this.productCode = productCode;
		this.productDesc = productDesc;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
	@Override
	public String toString() {
		return "Product: " + this.getProductId() + " " + this.getProductCode() + " " + this.getProductDesc();		
	}
}
