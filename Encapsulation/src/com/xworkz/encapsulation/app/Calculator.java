package com.xworkz.encapsulation.app;

public class Calculator {
	private String color = "black";
	private String type = "scientific";
	private String design = "compact";
	private String autoPower = "off";
	private String operations = "standard";
	
	@Override
	public String toString() {
		return "Color" + this.color   +   "Design" + this.design  +  "Type" + this.type  +  "AutoPower" + this.autoPower  +  "Operations" + this.operations;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	
	public String getAutoPower() {
		return autoPower;
	}
	public void setAutoPower(String autoPower) {
		this.autoPower = autoPower;
	}
	
	public String getOperations() {
		return operations;
	}
	public void setOperations(String operations) {
		this.operations = operations;
	}
	

}
