package com.email.cofig.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.email.cofig.model.Product;
import com.email.cofig.repo.ProductRepository;
import com.email.cofig.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository repo;
	@Transactional
	public Integer saveProduct(Product p) {
	//calculations here..
	//gstAmt= cost*gst/100
	//totalAmt=cost+ gstAmt - disc
	p=repo.save(p);
	return p.getId();
	}
	@Transactional(readOnly= true)
	public List<Product> getAllProducts() {
		return repo.findAll();
		}
	@Transactional
	public void deleteProduct(Integer id) {
	repo.deleteById(id);
	}
	@Transactional(readOnly=true)
	public Product getProductById(Integer id) {
	Optional<Product> p=repo.findById(id);
	return p.get();
	}

	}

