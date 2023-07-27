package com.xworkz.equals.app;

public class DryFruit {
	private String type;
	private String brand;
	private int price;
	private String usedFor;
	private String dryTemp;
	private String quality;
	public DryFruit(String type, String brand, int price, String usedFor, String dryTemp, String quality) {
		super();
		this.type = type;
		this.brand = brand;
		this.price = price;
		this.usedFor = usedFor;
		this.dryTemp = dryTemp;
		this.quality = quality;
		System.out.println("invoking String int const in dryfruits");
	}
	
	public DryFruit() {
		System.out.println("invoking no-arg const in dryfruits");	
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in dryfruit");

		if (obj != null) {
			System.out.println("arg is not null, can compare");
		} else {
			System.err.println("arg is null,cannot compare");
		}

		if (obj instanceof DryFruit) {
			System.out.println("Arg is DryFruit");
		} else {
			System.err.println("Arg is not DryFruit");
		}

		System.out.println(this);
		System.out.println(obj);
		DryFruit casted = (DryFruit)obj;

		if (this.brand == casted.brand && this.type == casted.type && this.price == casted.price && this.usedFor == casted.usedFor && this.dryTemp == casted.dryTemp && this.quality == casted.quality) {
			System.out.println("Both are same");
			return true;
		} else {
			System.err.println("Both are not same");
		}

		return false;
	}
	
	@Override
	public String toString() {
		return "Brand"+this.brand + "Type"+this.type + "DryTemp"+this.dryTemp + "Usedfor"+this.usedFor + "Price"+this.price + "Quality" + this.quality;
				
	}
	
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getDryTemp() {
		return dryTemp;
	}
	public String getUsedFor() {
		return usedFor;
	}
	public String getQuality() {
		return quality;
	}
	public String getType() {
		return type;
	}
	
	
	

}
