package com.xworkz.daimond.app;

public class CornPizza implements ChickenPizza,VegPizza {

	@Override
	public void Cheese() {
	  System.out.println("overriding cheese in cornpizza");
	   
		
	}

	@Override
	public void chickencheese() {
		 System.out.println("overriding chickencheese in cornpizza");
		
	}

	@Override
	public void taste() {
		 System.out.println("overriding taste in cornpizza");
	}
	
}
