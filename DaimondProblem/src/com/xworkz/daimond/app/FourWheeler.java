package com.xworkz.daimond.app;

public class FourWheeler implements CarVehicle,JeepVehicle {

	@Override
	public void playMusic() {
		System.out.println("overriding playmusic in fourwheeler");
		
	}

	@Override
	public void airbag() {
		System.out.println("overriding airbag in fourwheeler");
		
	}

	@Override
	public void engine() {
		System.out.println("overriding engine in fourwheeler");
	}

	@Override
	public void speed() {
		System.out.println("overriding speed in fourwheeler");
		
		
	}
	
	

}
