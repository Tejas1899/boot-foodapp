package com.ty.bootfoodapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bootfoodapp.dao.FoodOrderDao;
import com.ty.bootfoodapp.dto.FoodOrder;
import com.ty.bootfoodapp.dto.Items;

@Service
public class FoodOrderService {

	@Autowired
	FoodOrderDao dao;

	public FoodOrder saveFoodOrder(FoodOrder foodOrder) {
		List<Items> items=foodOrder.getItems();
		double sum=0;
		for (Items item : items) {
			sum +=item.getCost()*item.getQuantity();
			item.setOrder(foodOrder); 
		}
		foodOrder.setCost(sum);
		return dao.saveFoodOrder(foodOrder);
	}

	public List<FoodOrder> getAllFoodOrder() {
		return dao.getAllFoodOrder();
	}

	public FoodOrder getFoodOrderById(int id) {
		return dao.getFoodOrderById(id);
	}
}
