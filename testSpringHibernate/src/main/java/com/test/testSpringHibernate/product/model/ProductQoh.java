package com.test.testSpringHibernate.product.model;

public class ProductQoh implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8260429882325467169L;
	private Long qohId;
	private long productId;
	private int qty;
	
	public ProductQoh(long productId, int qty) {
		this.productId = productId;
		this.qty = qty;
	}

	public Long getQohId() {
		return qohId;
	}

	public void setQohId(Long qohId) {
		this.qohId = qohId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
