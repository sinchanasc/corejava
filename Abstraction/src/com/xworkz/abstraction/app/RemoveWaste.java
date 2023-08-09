package com.xworkz.abstraction.app;

public class RemoveWaste {
	
	private Kidney kid;

	public RemoveWaste(Kidney kid) {
		this.kid = kid;

	}

	public void getClean() {
		if (kid != null) {
			System.out.println("Kidney is not null");
		} 
		else {
			System.err.println("kidney is null");
		}
	}
}
