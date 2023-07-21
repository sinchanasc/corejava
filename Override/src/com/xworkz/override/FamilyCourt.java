package com.xworkz.override;

public class FamilyCourt extends CivilCourt {
	void divorceCase() {
		System.out.println("invoking the arg of divorcecase");
	}
	
	
	
	@Override
	void criminalCase() {
		System.out.println("override criminalcase in familycourt");
	}
	
	@Override
	void forgeryCase() {
		System.out.println("override forgerycase in familycourt");

	}
	
	@Override
	void propertyCase() {
		System.out.println("override propertycase in familycourt");
	}
	
	@Override
	void theftCase() {
		System.out.println("override theftcase in familycourt");
	}
	


}
