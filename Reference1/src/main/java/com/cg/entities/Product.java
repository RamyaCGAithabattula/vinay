package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@Column(name="id",length=20)
	String productId;
	
	@Column(name="name",length=20)
	String productName;
	
	@Column(name="model",length=20)
	String productModel;
	
	@Column(name="price")
	Double productPrice;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, String productModel, Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productModel = productModel;
		this.productPrice = productPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productModel=" + productModel
				+ ", productPrice=" + productPrice + "]";
	}
	
	
	
}
