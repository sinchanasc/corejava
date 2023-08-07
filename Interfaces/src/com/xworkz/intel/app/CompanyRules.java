package com.xworkz.intel.app;

public class CompanyRules implements Company {

	@Override
	public void getLogin() {
		System.out.println("Invoking the company in login In time");	
	}

	@Override
	public void doWork_InTime() {
		System.out.println("Invoking the company do works in time");
	} 

}
