package com.xworkz.daimond.app;

public class Runner {
	public static void main(String[] args) {
		BtmCoolDrinks cd = new BtmCoolDrinks();
		cd.cool();
		cd.energy();
		cd.stamina();
		
		CokeCoolDrinks ccd = new BtmCoolDrinks();
		ccd.cool();
		ccd.stamina();
		
		PepsiCoolDrinks pcd = new BtmCoolDrinks();
		pcd.cool();
		pcd.energy();
		
		CoolDrinks cdd = new BtmCoolDrinks();
	    cdd.cool();
		
	}
}
