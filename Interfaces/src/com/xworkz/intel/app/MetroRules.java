package com.xworkz.intel.app;

public class MetroRules implements Metro {

	@Override
	public void getCoins() {
		System.out.println("invoking the metro rules");
	}
	
	@Override
	public void getWithinTime() {
		System.out.println("the coins is vaild only one hour");
	}
 

}
