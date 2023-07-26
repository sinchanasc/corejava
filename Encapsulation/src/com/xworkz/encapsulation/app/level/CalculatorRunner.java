package com.xworkz.encapsulation.app.level;

import com.xworkz.encapsulation.app.Calculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator);
		
		calculator.setAutoPower(null);
		calculator.setColor("white");
		calculator.setDesign("portable");
		calculator.setOperations(null);
		calculator.setType("numeric");
		System.out.println(calculator);

	}

}
