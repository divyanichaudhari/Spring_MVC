package com.spring.bo;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.spring.model.Dish;

//use appropriate annotation to make this class as component class
@Component
public class DishBO {

	public double calculateDishSalesAmount(Dish dishObj) {
		double dishSalesAmount = 0;
		// Fill the code
		
		Map<String, Double> dishDetails = dishObj.getDishDetails();
		
		for(Map.Entry<String, Double> entry: dishDetails.entrySet()) {
			
			dishSalesAmount = dishSalesAmount + entry.getValue();
		}
		
		return dishSalesAmount;
	}
}
