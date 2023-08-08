package com.xworkz.daimond.app;

public interface CarVehicle {
	void airbag();
	
	public default void engine() {
		System.out.println("default method");
	}

	public void speed();

}
