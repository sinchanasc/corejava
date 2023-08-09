package com.xworkz.abstraction.app;

public class HomeLift {
	
	private Elevator elevator;

	public HomeLift(Elevator elevator) {
		this.elevator = elevator;

	}

	public void getLaggage() {
		if (elevator != null) {
			System.out.println("elevator is not null");
		} 
		else {
			System.err.println("elevator is null");
		}
	}


}
