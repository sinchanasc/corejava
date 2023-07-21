package com.xworkz.chaining;

public class BroilerChicken extends FarmChicken{
	boolean isAlive;
	float weight;
	public BroilerChicken(int price, String location, int noOfDays, String careTaker, boolean isAlive, float weight) {
		super(price, location, noOfDays, careTaker);
		this.isAlive = isAlive;
		this.weight = weight;
		System.out.println("invoking int,string,boolean,float in broilerchicken");
	}
	
	@Override
	void printInfo() {
		System.out.println("running printinfo in farmchicken...");
		super.printInfo();
		System.out.println(this.isAlive);
		System.out.println(this.weight);	
		
	}
	
	

}
