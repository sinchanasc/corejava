package com.xworkz.abstraction.app;

public class EpsonCompany {

	private PrintingMachine machine;

	public EpsonCompany(PrintingMachine machine) {
		this.machine = machine;

	}

	public void getPrint() {
		if (machine != null) {
			System.out.println("machine is not null");
		} 
		else {
			System.err.println("machine is null");
		}
	}

}
