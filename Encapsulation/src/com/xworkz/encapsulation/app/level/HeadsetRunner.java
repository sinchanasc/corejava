package com.xworkz.encapsulation.app.level;

import com.xworkz.encapsulation.app.Headset;

public class HeadsetRunner {

	public static void main(String[] args) {
	 Headset headset = new Headset();
	 System.out.println(headset);
	 
	 headset.setBrand("sony");
	 headset.setBrandAmbassador("Tharakan Abraham");
	 headset.setColor("Silver");
	 headset.setModel("sony WF-1000xm5");
	 headset.setPrice(30000);
	 System.out.println(headset);
	 
	 

	}

}
