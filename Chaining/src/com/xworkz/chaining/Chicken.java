package com.xworkz.chaining;

public class Chicken {
	int price;
	String location;
	public Chicken(int price, String location)
	{
		super();
		this.price = price;
		this.location = location;
		System.out.println("invoking int,string in chicken");
	 }
	
	void printInfo() {
		System.out.println("invoking printinfo in chicken...");
		System.out.println(this.price);
		System.out.println(this.location);	

}
	
}
