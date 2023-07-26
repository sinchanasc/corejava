package com.xworkz.encapsulation.app;

public class Tap {
	private String material;
	private String finish;
	private String type;
	private String valveType;
	private int warranty;
	
	@Override
	public String toString() {
		return "Material" + this.material + "Finish" + this.finish  +  "Type" + this.type  +  "ValveType" + this.valveType  +  "Warranty" + this.warranty;
	
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getValveType() {
		return valveType;
	}
	public void setValveType(String valveType) {
		this.valveType = valveType;
	}
	
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
		


}
