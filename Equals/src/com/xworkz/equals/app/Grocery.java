package com.xworkz.equals.app;

public class Grocery {
	private double price;
	private int quantity;

	public Grocery(double price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
		System.out.println("invoking double,int const in grocery");
	}

	public Grocery() {
		System.out.println("invoking no arg const in grocery");
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in grocery");

		if (obj != null) {
			System.out.println("arg is not null, can compare");
		} else {
			System.err.println("arg is null,cannot compare");
		}

		if (obj instanceof Grocery) {
			System.out.println("Arg is Grocery");
		} else {
			System.err.println("Arg is not Grocery");
		}

		System.out.println(this);
		System.out.println(obj);
		Grocery casted = (Grocery) obj;

		if (this.price == casted.price && this.quantity == casted.quantity) {
			System.out.println("Both are same");
			return true;
		} else {
			System.err.println("Both are not same");
		}

		return false;
	}

	@Override
	public String toString() {
		return "price" + this.price + "Quantity" + this.quantity;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

}
