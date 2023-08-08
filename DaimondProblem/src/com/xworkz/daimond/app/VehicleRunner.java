package com.xworkz.daimond.app;

public class VehicleRunner {

	public static void main(String[] args) {
		
		FourWheeler fw = new FourWheeler();
		fw.airbag();
		fw.engine();
		fw.speed();
		fw.playMusic();
		
		
		CarVehicle cv = new FourWheeler();
		cv.speed();
		cv.engine();
		cv.airbag();
		
		JeepVehicle jv = new FourWheeler();
		jv.engine();
		jv.speed();
		jv.playMusic();
		
		FourWheeler vehicle = new FourWheeler();
		vehicle.engine();
		vehicle.speed();

	}

}
