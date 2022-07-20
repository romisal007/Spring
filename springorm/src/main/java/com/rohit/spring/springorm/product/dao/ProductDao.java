package com.rohit.spring.springorm.product.dao;

import java.util.List;

import com.rohit.spring.springorm.product.entity.Product;

public interface ProductDao {

	int create(Product product);
	void update(Product product);
	void delect(Product product);
	Product find(int id);
	List<Product> findall();
	
}
