package com.xworkz.encapsulation.app;

public class Mixture {
	private String brand = "MTR";
	private double price = 50;
	private String type = "snacks";
	private String quantity = "200g";
	private String quality = "good";
	
	@Override
	public String toString() {
		return "Brand" + this.brand   +   "Price" + this.price  +  "Type" + this.type  +  "Quantity" + this.quantity  +  "Quality" + this.quality;
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getQuantity() {
		return quantity;
	}
	
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	public String getQuality() {
		return quality;
	}
	
	public void setQuality(String quality) {
		this.quality = quality;
	}
	
}
