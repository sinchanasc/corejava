package com.xworkz.override;

public class HighCourt extends SupremeCourt {
	void criminalCase() {
		System.out.println("invoking the arg of criminalcase");
	}
	
	void forgeryCase() {
		System.out.println("invoking the arg of criminalcase");

	}
	
	
	
	@Override
	void importantCase() {
		System.out.println("override importantcase in highcourt");
		}


}
