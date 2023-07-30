package com.xworkz.topics.app;

public class VegetableShop {
	String name;
	int cost;
	public VegetableShop(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
		System.out.println("invoking String , int const of shop");

	}
	
	void printInfo()
	{
		System.out.println("invoking printInfo in shop");
		System.out.println(this.name);
		System.out.println(this.cost);

	}
	
	
}
