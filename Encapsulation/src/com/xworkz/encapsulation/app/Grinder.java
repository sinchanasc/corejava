package com.xworkz.encapsulation.app;

public class Grinder {
	
	private double price;
	private int rpm;
	private String type;
	private double capacity;
	private String material;
	
	@Override
	public String toString() {
		return "Price" + this.price   +   "Rpm" + this.rpm  +  "Type" + this.type  +  "Capacity" + this.capacity  +  "material" + this.material;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getRpm() {
		return rpm;
	}
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
		


}
