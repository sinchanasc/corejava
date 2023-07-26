package com.xworkz.encapsulation.app;

public class Helmet {
	private String color;
	private String padding;
	private String innerLayerMadeOf;
	private String chinStrak;
	private String ventilations;
	
	@Override
	public String toString() {
		return "Color" + this.color   +   "Padding" + this.padding  +  "InnerLayerMadeOf" + this.innerLayerMadeOf  +  "chinStrak" + this.chinStrak  +  "Ventilations" + this.ventilations;
	}
	
	public String getChinStrak() {
		return chinStrak;
	}
	public void setChinStrak(String chinStrak) {
		this.chinStrak = chinStrak;
	}
	
	public String getPadding() {
		return padding;
	}
	public void setPadding(String padding) {
		this.padding = padding;
	}
	
	public String getInnerLayerMadeOf() {
		return innerLayerMadeOf;
	}
	public void setInnerLayerMadeOf(String innerLayerMadeOf) {
		this.innerLayerMadeOf = innerLayerMadeOf;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getVentilations() {
		return ventilations;
	}
	public void setVentilations(String ventilations) {
		this.ventilations = ventilations;
	}


}
