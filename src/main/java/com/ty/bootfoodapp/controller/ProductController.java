package com.ty.bootfoodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bootfoodapp.dto.Product;
import com.ty.bootfoodapp.dto.User;
import com.ty.bootfoodapp.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveproduct(product);
	}

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProduct();
	}

	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) {
		return productService.getProductById(id);
	}

	@DeleteMapping("/products")
	public String deleteProduct(@RequestParam int id) {
		return productService.deleteProduct(id);
	}

	@PutMapping("/products")
	public Product updateProduct(@RequestParam int id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}
}
