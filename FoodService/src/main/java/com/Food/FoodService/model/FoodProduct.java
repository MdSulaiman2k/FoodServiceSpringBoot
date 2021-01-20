package com.Food.FoodService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodProduct {
	
	@Id
	private int foodId;
	private String foodname ;
	private double  price ;
	private int quantity ;
	
	@Override
	public String toString() {
		return "FoodProduct [foodId=" + foodId + ", foodname=" + foodname + ", price=" + price 
				+ ", quantity=" + quantity + "]";
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
