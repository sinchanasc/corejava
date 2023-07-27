package com.xworkz.equals.runner;

import com.xworkz.equals.app.Gold;

public class GoldRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in Gold runner");

		Gold gold = new Gold(25000,"solid","yellow","soft");
		System.out.println(gold);

		Gold gold2 = new Gold(50000,"solid","bright yellow","soft");
		System.out.println(gold2);

		boolean same = gold.equals(gold2);
		System.out.println("Both Gold is same" + same);

		
	}

}
