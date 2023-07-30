package com.xworkz.topics.app;

public class Vegetable extends VegetableShop {
	boolean fresh;

	public Vegetable(String name, int cost, boolean fresh) {
		super(name, cost);    //superchaining
		this.cost=cost;
		this.name=name;
		this.fresh=fresh;
		System.out.println("invoking string,int const of vegetable");
	}
	
	@Override
	public void printInfo() {
		System.out.println("running printInfo in vegetable");
		super.printInfo();
		System.out.println(this.fresh);

}
}
