package com.xworkz.abstraction.app;

public class RanveerSingh {
	
	private SmartWatch watch;
	
	public RanveerSingh(SmartWatch watch) {
		this.watch=watch;
	}
	
	public void getShowTime() {
		if (watch != null) {
			System.out.println("watch is not null");
		} 
		else {
			System.err.println("watch is null");
		}
	}	

}
