package com.xworkz.equals.runner;

import com.xworkz.equals.app.DryFruit;

public class DryFruitRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in  DryFruitrunner");

		DryFruit dryfruit = new DryFruit("Almond","Happilo",200,"weightloss","70c","good");
		System.out.println(dryfruit);

		DryFruit dryfruit2 = new DryFruit("Pista","Happilo",400,"weightloss","60c","good");
		System.out.println(dryfruit2);

		boolean same = dryfruit.equals(dryfruit2);
		System.out.println("Both Slipper is same" + same);

	}

}
