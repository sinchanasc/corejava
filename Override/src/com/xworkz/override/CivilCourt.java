package com.xworkz.override;

public class CivilCourt extends HighCourt {
	void propertyCase() {
		System.out.println("invoking the arg of propertycase");
	}
	
	void theftCase() {
		System.out.println("invoking the arg of propertycase");
	}
	
	
	
	@Override
	void criminalCase() {
		System.out.println("override criminalcase in civilcourt");
	}
	
	@Override
	void forgeryCase() {
		System.out.println("override criminalcase in civilcourt");

	}
	

}
