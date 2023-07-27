package com.xworkz.equals.runner;

import com.xworkz.equals.app.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Grocery runner");

		Grocery grocery = new Grocery(100, 1);
		System.out.println(grocery);

		Grocery grocery2 = new Grocery(200, 1);
		System.out.println(grocery);

		boolean same = grocery.equals(grocery2);
		System.out.println("Both Grocery is same" + same);

	}

}
