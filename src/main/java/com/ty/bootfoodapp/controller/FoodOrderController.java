package com.ty.bootfoodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bootfoodapp.dto.FoodOrder;
import com.ty.bootfoodapp.service.FoodOrderService;

@RestController
public class FoodOrderController {

	@Autowired
	FoodOrderService foodOrderService;

	@PostMapping("/foodorders")
	public FoodOrder saveFoodOrder(@RequestBody FoodOrder foodOrder) {
		return foodOrderService.saveFoodOrder(foodOrder);
	}

	@GetMapping("/foodorders")
	public List<FoodOrder> getAllFoodOrders() {
		return foodOrderService.getAllFoodOrder();
	}

	@GetMapping("/foodorders/{id}")
	public FoodOrder getFoodOrderById(@PathVariable int id) {
		return foodOrderService.getFoodOrderById(id);
	}
}
