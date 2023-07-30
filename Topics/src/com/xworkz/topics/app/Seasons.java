package com.xworkz.topics.app;

public class Seasons {
	
	final int season;
	
	public void types() {
		System.out.println("there are three types");
		//season = 3; 
	
	}

	public Seasons(int season) {
		this.season = 3;
		System.out.println("initialising final in constructor ");
	}
	
	public final void method() {
		System.out.println("final method of seasons");
	}
	
	

}
