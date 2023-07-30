package com.xworkz.topics.app.level;

import com.xworkz.topics.app.Animal;
import com.xworkz.topics.app.Bicycle;
import com.xworkz.topics.app.IceCream;
import com.xworkz.topics.app.Truck;
import com.xworkz.topics.app.MotorCycle;


public class Runner {

	public static void main(String[] args) {
		
		Animal ani = new Animal("German shepherd","German");
		System.out.println(ani.getName());
		System.out.println(ani.getBreed());
		
		
		IceCream ice = new IceCream(5, true, "chocolate");
		System.out.println(ice.isTasty);
		System.out.println(ice.name);
		System.out.println(ice.variety);
		
		Truck truck = new Truck("Ford","F-150",2023);
		System.out.println(truck.make);
		System.out.println(truck.model);
		System.out.println(truck.year);
		
		Bicycle bicycle = new Bicycle("trek", null);
		System.out.println(bicycle.make);
		System.out.println(bicycle.model);
		
		MotorCycle motorcycle = new MotorCycle("Hond", "CBR");
		System.out.println(motorcycle.make);
		System.out.println(motorcycle.model);

		

	}

}
