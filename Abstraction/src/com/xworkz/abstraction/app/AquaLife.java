package com.xworkz.abstraction.app;

public class AquaLife {
	
	private WaterPurifier purify;

	public AquaLife(WaterPurifier purify) {
		this.purify = purify;

	}

	public void getFilter() {
		if (purify != null) {
			System.out.println("waterpurifier is not null");
		} 
		else {
			System.err.println("waterpurifier is null");
		}
	}

}
