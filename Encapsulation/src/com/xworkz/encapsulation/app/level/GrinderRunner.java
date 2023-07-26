package com.xworkz.encapsulation.app.level;

import com.xworkz.encapsulation.app.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		Grinder grinder = new Grinder();
		System.out.println(grinder);
		
		grinder.setCapacity(40);
		grinder.setMaterial("metal");
		grinder.setPrice(3000);
		grinder.setRpm(300);
		grinder.setType("Bench");
		
		System.out.println(grinder);
		


	}

}
