package com.xworkz.encapsulation.app.level;

import com.xworkz.encapsulation.app.Tap;

public class TapRunner {

	public static void main(String[] args) {
		Tap tap = new Tap();
		System.out.println(tap);
		
		tap.setFinish("matte black");
		tap.setMaterial("plastic");
		tap.setType("single-handle");
		tap.setValveType("ceramicdisc");
		tap.setWarranty(2);
		System.out.println(tap);

	}

}
