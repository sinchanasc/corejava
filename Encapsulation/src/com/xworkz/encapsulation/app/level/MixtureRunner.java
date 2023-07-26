package com.xworkz.encapsulation.app.level;

import com.xworkz.encapsulation.app.Mixture;

public class MixtureRunner {

	public static void main(String[] args) {
		
		Mixture mixture = new Mixture();
		
		System.out.println(mixture);
		
		mixture.setBrand("haladiram");
		mixture.setPrice(100);
		mixture.setType("null");
		mixture.setQuality("not good");
		mixture.setQuantity("250g");
		
		System.out.println(mixture);

	}

}
