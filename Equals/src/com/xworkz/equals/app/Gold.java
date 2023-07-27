package com.xworkz.equals.app;

public class Gold {
	private double price;
	private String state;
	private String color;
	private String metal;

	public Gold(double price, String state, String color, String metal) {
		super();
		this.price = price;
		this.state = state;
		this.color = color;
		this.metal = metal;
		System.out.println("invoking double,string const in Gold");
	}

	public Gold() {
		System.out.println("invoking no arg const in Gold");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in Gold");

		if (obj != null) {
			System.out.println("arg is not null, can compare");
		} else {
			System.err.println("arg is null,cannot compare");
		}

		if (obj instanceof Gold) {
			System.out.println("Arg is Gold");
		} else {
			System.err.println("Arg is not Gold");
		}

		System.out.println(this);
		System.out.println(obj);
		Gold casted = (Gold) obj;

		if (this.price == casted.price && this.color == casted.color && this.state == casted.state
				&& this.metal == casted.metal) {
			System.out.println("Both are same");
			return true;
		} else {
			System.err.println("Both are not same");
		}
		return false;

	}

	@Override
	public String toString() {
		return "Price" + this.price + "Color" + this.color + "Metal" + this.metal + "State" + this.state;

	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public String getMetal() {
		return metal;
	}

	public String getState() {
		return state;
	}

}
