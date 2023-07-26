package com.xworkz.encapsulation.app.level;

import com.xworkz.encapsulation.app.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		Helmet helmet = new Helmet();
		System.out.println(helmet);
		
		helmet.setColor("black");
		helmet.setChinStrak("adjustable");
		helmet.setInnerLayerMadeOf("polystyrene");
		helmet.setPadding("inner");
		helmet.setVentilations("holes");
		System.out.println(helmet);

	}

}
