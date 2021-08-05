package com.email.cofig.service;

import java.util.List;

import com.email.cofig.model.Product;

public interface IProductService {
	public Integer saveProduct(Product p);
	public List<Product> getAllProducts();
	public void deleteProduct(Integer id);
	public Product getProductById(Integer id);
}
