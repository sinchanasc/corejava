package com.xworkz.intel.app;

public class VtuRules implements Vtu {

	@Override
	public void getStudent_Info() {
		System.out.println("Invoking the VTU in Student information");	
	}

	@Override
	public void getPass() {
		System.out.println("Invoking the Vtu in Student pass details");
	} 

}
