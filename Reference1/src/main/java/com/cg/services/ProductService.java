package com.cg.services;

import java.util.List;

import com.cg.entities.Product;

public interface ProductService {
	
	
	void create(Product p);
	void update(String id, Product p);
	void delete(String productId);
	List<Product> getAllProducts();
	Product find(String productId);

}
