package com.xworkz.override;

public class SupremeCourt extends Court {
	
	void importantCase() {
		System.out.println("invoking the arg of importantcase");
		}
	
	@Override
	void justice() {
		System.out.println("override justice in supremecourt ");
	}

	
	
}
