package com.xworkz.encapsulation.app;

public class Dosa {
	private String shape = "circular";
	private String color = "goldenBrown";
	private String flavor = "mild";
	private String ingredients = "rice";
	private String nutritionalValue = "Vitamin B";
	
	@Override
	public String toString() {
		return "Shape" + this.shape   +   "Color" + this.color  +  "Flavor" + this.flavor  +  "Ingredients" + this.ingredients  +  "NutritionalValue" + this.nutritionalValue;
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	public String getNutritionalValue() {
		return nutritionalValue;
	}
	public void setNutritionalValue(String nutritionalValue) {
		this.nutritionalValue = nutritionalValue;
	}
		


}
