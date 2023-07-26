package com.xworkz.encapsulation.app;

public class Headset {
	private String brand = "Bose";
	private String model = "QuietComfort 35";
	private String color = "black";
	private double price = 29999;
	private String brandAmbassador = "Golfer";
	
	@Override
	public String toString() {
		return "Brand" + this.brand +  "Price" + this.price + "Model" + this.model  + "Color" + this.color +  "BrandAmbassador" + this.brandAmbassador;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBrandAmbassador() {
		return brandAmbassador;
	}
	public void setBrandAmbassador(String brandAmbassador) {
		this.brandAmbassador = brandAmbassador;
	}
		


}
