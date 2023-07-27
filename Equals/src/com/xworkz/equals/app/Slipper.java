package com.xworkz.equals.app;

public class Slipper {
	private String brand;
	private int size;
	private String type;
	private String color;
	private String coating;
	private String quality;
	private String shape;
	public Slipper(String brand, int size, String type, String color, String coating, String quality, String shape) {
		super();
		this.brand = brand;
		this.size = size;
		this.type = type;
		this.color = color;
		this.coating = coating;
		this.quality = quality;
		this.shape = shape;
		System.out.println("invoking int,string const in Slippers");
	}
	public Slipper() {
		System.out.println("invoking no-arg const in Slippers");
		
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals in slipper");

		if (obj != null) {
			System.out.println("arg is not null, can compare");
		} else {
			System.err.println("arg is null,cannot compare");
		}

		if (obj instanceof Slipper) {
			System.out.println("Arg is Slipper");
		} else {
			System.err.println("Arg is not Slipper");
		}

		System.out.println(this);
		System.out.println(obj);
		Slipper casted = (Slipper) obj;

		if (this.brand == casted.brand && this.type == casted.type && this.color == casted.color && this.size == casted.size && this.coating == casted.coating && this.quality == casted.quality && this.shape == casted.shape) {
			System.out.println("Both are same");
			return true;
		} else {
			System.err.println("Both are not same");
		}

		return false;
	}
	
	@Override
	public String toString() {
		return "Brand"+this.brand + "Type"+this.type + "Color"+this.color + "Coating"+this.coating + "Size"+this.size + "Quality" + this.quality + "Shape" + this.shape;
				
	}
	
	public String getBrand() {
		return brand;
	}
	public int getSize() {
		return size;
	}
		public String getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	public String getCoating() {
		return coating;
	}
	public String getQuality() {
		return quality;
	}
	public String getShape() {
		return shape;
	}

	
	

}
