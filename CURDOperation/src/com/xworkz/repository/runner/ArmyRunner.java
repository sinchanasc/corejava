package com.xworkz.repository.runner;

import com.xworkz.repository.app.army.Army;
import com.xworkz.repository.app.army.ArmyImpl;

public class ArmyRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Army Runner");

		Army repository = new ArmyImpl();
		
		repository.save("Indian Army");
		repository.save("Indian Navy");
		repository.save("Indian Air Force");
		repository.save("Military Forces");
		repository.save("Central Armed Police Forces");
		
		System.out.println("***************************");
		
		repository.display();

	}

}
