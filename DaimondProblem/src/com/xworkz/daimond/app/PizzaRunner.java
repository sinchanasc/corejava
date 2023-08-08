package com.xworkz.daimond.app;

public class PizzaRunner {
	public static void main(String[] args) {
		CornPizza cp = new CornPizza();
		cp.taste();
		cp.Cheese();
		cp.taste();
		
		VegPizza vp = new CornPizza();
		vp.Cheese();
		vp.taste();
		
		ChickenPizza chp = new CornPizza();
		chp.chickencheese();
		chp.taste();
		
		Pizza p = new CornPizza();
		p.taste();
			
	}

}
