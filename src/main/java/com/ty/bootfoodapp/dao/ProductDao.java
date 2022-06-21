package com.ty.bootfoodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bootfoodapp.dto.Product;
import com.ty.bootfoodapp.repository.ProductRepository;

@Repository
public class ProductDao {

	@Autowired
	ProductRepository productRepository;

	public Product saveproduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	public Product getProductById(int id) {
		Optional<Product> optional = productRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public String deleteProduct(int id) {
		Optional<Product> optional = productRepository.findById(id);
		if (optional.isEmpty()) {
			return "Product not found";
		} else {
			productRepository.delete(optional.get());
			return "Product deleted";
		}
	}

	public Product updateProduct(int id, Product product) {
		Optional<Product> optional = productRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		} else {
			return productRepository.save(product);
		}
	}
}
