package com.xworkz.chaining;

public class ChickenRunner {
	public static void main(String[] args) {
		
		System.out.println("invoking main in ChickenRunner");
		
		Chicken chicken = new Chicken(350,"BTM");
		chicken.printInfo();
		
		FarmChicken farmchicken = new FarmChicken( 350,"BTM",5,"chicken farmer");
		farmchicken.printInfo();
		
		BroilerChicken broilerchicken = new BroilerChicken(350,"BTM",5,"chicken farmer",false,2);
		broilerchicken.printInfo();
		
	}
	

}
