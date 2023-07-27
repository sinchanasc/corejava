package com.xworkz.equals.runner;

import com.xworkz.equals.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in  Slipperrunner");

		Slipper slipper = new Slipper("walkmate",6,"flat","black","matte","good","cartoon");
		System.out.println(slipper);

		Slipper slipper2 = new Slipper("crocs",7,"flat","white","null","good","cartoon");
		System.out.println(slipper2);

		boolean same = slipper.equals(slipper2);
		System.out.println("Both Slipper is same" + same);

	}

}
