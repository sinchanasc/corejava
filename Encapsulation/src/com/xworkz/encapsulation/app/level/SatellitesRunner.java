package com.xworkz.encapsulation.app.level;

import com.xworkz.encapsulation.app.Satellites;

public class SatellitesRunner {

	public static void main(String[] args) {
	 
		Satellites satellites = new Satellites();
		System.out.println(satellites);
		
		satellites.setSize("10cm");
		satellites.setCommunication("voicesignal");
		satellites.setLaunchVehicle("rocket");
		satellites.setPayload("camera");
		satellites.setType("cube");
		
		System.out.println(satellites);

	}

}
