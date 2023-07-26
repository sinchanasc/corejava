package com.xworkz.encapsulation.app.level;

import com.xworkz.encapsulation.app.Dosa;

public class DosaRunner {
	public static void main(String[] args) {
		
		Dosa dosa = new Dosa();
		System.out.println(dosa);
		
		dosa.setColor(null);
		dosa.setFlavor("tangy");
		dosa.setIngredients(null);
		dosa.setNutritionalValue(null);
		dosa.setShape(null);
		
		System.out.println(dosa);
	}

}
