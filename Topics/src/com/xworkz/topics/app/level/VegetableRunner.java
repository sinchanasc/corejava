package com.xworkz.topics.app.level;

import com.xworkz.topics.app.Vegetable;

public class VegetableRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in VegetableRunner");
		
		Vegetable vegetable = new Vegetable("Potato", 50,false);
		vegetable.printInfo();
		

	}

}
