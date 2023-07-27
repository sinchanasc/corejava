package com.xworkz.equals.app;

public class Assets {
	private String type;
	private String location;
	private double price;
	public Assets(String type, String location, double price) {
		super();
		this.type = type;
		this.location = location;
		this.price = price;
		System.out.println("invoking double,string const in Aessts");
	}
	
	public Assets() {
		System.out.println("invoking no-arg const in Aessts");
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in assets");

		if (obj != null) {
			System.out.println("arg is not null, can compare");
		} else {
			System.err.println("arg is null,cannot compare");
		}

		if (obj instanceof Assets) {
			System.out.println("Arg is Assets");
		} else {
			System.err.println("Arg is not Assets");
		}

		System.out.println(this);
		System.out.println(obj);
		Assets casted = (Assets)obj;

		if (this.type == casted.type && this.price == casted.price && this.location == casted.location) {
			System.out.println("Both are same");
			return true;
		} else {
			System.err.println("Both are not same");
		}

		return false;
	}
	
	public String toString() {
		return "Type"+this.type + "Price"+this.price + "Location"+this.location;
	}
	
	public String getType() {
		return type;
	}
	public String getLocation() {
		return location;
	}
	public double getPrice() {
		return price;
	}
	

}
