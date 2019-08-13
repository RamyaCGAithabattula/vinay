package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Product;
import com.cg.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService service;

	@GetMapping(value = "/")
	public List<Product> getAllProducts() {

		return service.getAllProducts();
	}

	@GetMapping(value = "/find/{id}")
	public Product findById(@PathVariable String id) {
		return service.find(id);
	}

	@PostMapping(value = "/new", consumes = { "application/json" })
	public String save(@RequestBody Product product) {
		service.create(product);
		return "Product added Successfully";
	}

	@PutMapping(value = "/update/{id}", consumes = { "application/json" })
	public String update(@PathVariable String id, @RequestBody Product product) {
		service.update(id, product);
		return "Product updated Successfully";
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String delete(@PathVariable String id)
	{
		service.delete(id);
		return "Product deleted Succesfully";
	}
	

}
