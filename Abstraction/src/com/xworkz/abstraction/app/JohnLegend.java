package com.xworkz.abstraction.app;

public class JohnLegend {

	private WashingMachine washing;

	public JohnLegend(WashingMachine washing) {
		this.washing = washing;

	}

	public void getWash() {
		if (washing != null) {
			System.out.println("washingmachine is not null");
		} else {
			System.err.println("washingmachine is null");
		}
	}

}
