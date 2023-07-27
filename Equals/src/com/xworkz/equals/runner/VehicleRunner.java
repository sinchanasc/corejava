package com.xworkz.equals.runner;

import com.xworkz.equals.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in Vehicle runner");

		Vehicle vehicle = new Vehicle("car", "black", 4, "petrol", 1);
		System.out.println(vehicle);

		Vehicle vehicle2 = new Vehicle("car", "white", 4, "petrol", 1);
		System.out.println(vehicle);

		boolean same = vehicle.equals(vehicle2);
		System.out.println("Both Vehicle is same" + same);

	}

}
