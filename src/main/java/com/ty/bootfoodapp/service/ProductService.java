package com.ty.bootfoodapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bootfoodapp.dao.ProductDao;
import com.ty.bootfoodapp.dto.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao dao;
	
	public Product saveproduct(Product product) {
		return dao.saveproduct(product);
	}

	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}

	public Product getProductById(int id) {
		return dao.getProductById(id);
	}

	public String deleteProduct(int id) {
		return dao.deleteProduct(id);
	}

	public Product updateProduct(int id, Product product) {
		return dao.updateProduct(id, product);
	}
}
