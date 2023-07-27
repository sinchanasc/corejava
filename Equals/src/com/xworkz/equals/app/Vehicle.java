package com.xworkz.equals.app;

public class Vehicle {
	private String type;
	private String color;
	private int noOfWheels;
	private String engine;
	private int airBag;
	
	public Vehicle(String type, String color, int noOfWheels, String engine, int airBag) {
		super();
		this.type = type;
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.engine = engine;
		this.airBag = airBag;
		System.out.println("invoking String ,int const of Vehicle");
	}
	
	public Vehicle() {
		System.out.println("invoking no-arg const of Vehicle");	
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in vehicle");
		
		if(obj!=null) {
			System.out.println("arg is not null, can compare");
		}else {
			System.err.println("arg is null,cannot compare");
		}
		
		if (obj instanceof Vehicle) {
			System.out.println("Arg is Vehicle");
		}else {
			System.err.println("Arg is not Vehicle");
		}
		
		System.out.println(this);
		System.out.println(obj);
		Vehicle casted = (Vehicle)obj;
		
		if(this.type==casted.type && this.color==casted.color && this.engine==casted.engine && this.airBag==casted.airBag  && this.noOfWheels==casted.noOfWheels ) {
			System.out.println("Both are same");
			return true;
		}else {
			System.err.println("Both are not same");
		}
		return false;
		
			}
	
	@Override
	public String toString() {
		return "Type"+this.type + "Color"+this.color + "Engine"+this.engine + "AirBag"+this.airBag + "NoOfWheels"+this.noOfWheels;
				
	}
	
	public String getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	public String getEngine() {
		return engine;
	}
	public int getAirBag() {
		return airBag;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}	

}
