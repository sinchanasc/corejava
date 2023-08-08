package com.xworkz.daimond.app;

public class BtmCoolDrinks implements PepsiCoolDrinks , CokeCoolDrinks {

	@Override
	public void stamina() {
		System.out.println("overriding stamina in btmCooldrinks");
		
	}

	@Override
	public void energy() {
		System.out.println("overriding enery in btmCooldrinks");
		
	}

	@Override
	public void cool() {
		System.out.println("overriding cool in btmCooldrinks");
		
	}
	
	
	

}
