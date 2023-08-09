package com.xworkz.abstraction.app;

public class NareshShardha {
	
	private Laptop lap;

	public NareshShardha(Laptop lap) {
		this.lap = lap;

	}

	public void getDisplay() {
		if (lap != null) {
			System.out.println("laptop is not null");
		} 
		else {
			System.err.println("laptop is null");
		}
	}


}
