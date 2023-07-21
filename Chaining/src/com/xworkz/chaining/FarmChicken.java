package com.xworkz.chaining;

public class FarmChicken extends Chicken {
	
	int noOfDays;
	String careTaker;
	
	public FarmChicken(int price, String location, int noOfDays, String careTaker) {
		super(price, location);
		this.noOfDays = noOfDays;
		this.careTaker = careTaker;
		System.out.println("invoking int,string in farmchicken");
	}
	
	@Override
	void printInfo() {
		System.out.println("running printinfo in farmchicken...");
		super.printInfo();
		System.out.println(this.noOfDays);
		System.out.println(this.careTaker);	

}
}
