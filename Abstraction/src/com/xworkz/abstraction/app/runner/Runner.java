package com.xworkz.abstraction.app.runner;

import com.xworkz.abstraction.app.*;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Running main in printing machine");

		PrintingMachine machine = new Printing();
		machine.print();

		EpsonCompany EC = new EpsonCompany(machine);
		EC.getPrint();

		System.out.println("Running main in Laptop");

		Laptop lap = new Dell();
		lap.display();

		NareshShardha NS = new NareshShardha(lap);
		NS.getDisplay();

		System.out.println("Running main in WaterPurifier...");

		WaterPurifier purify = new ROPurifier();
		purify.filter();

		AquaLife aqua = new AquaLife(purify);
		aqua.getFilter();

		System.out.println("Running main in Elevator");

		Elevator elevator = new OtisElevator();
		elevator.carrylaggage();

		HomeLift HF = new HomeLift(elevator);
		HF.getLaggage();

		System.out.println("Running main in Washingmachine");

		WashingMachine washing = new LG();
		washing.wash();

		JohnLegend JL = new JohnLegend(washing);
		JL.getWash();

		System.out.println("Running main in SmartWatch...");

		SmartWatch watch = new FastTrack();
		watch.showtime();

		RanveerSingh RS = new RanveerSingh(watch);
		RS.getShowTime();

		System.out.println("Running main in Kidney...");

		Kidney kid = new Body();
		kid.clean();

		RemoveWaste RW = new RemoveWaste(kid);
		RW.getClean();

	}

}
