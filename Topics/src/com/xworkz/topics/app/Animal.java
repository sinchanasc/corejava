package com.xworkz.topics.app;

public class Animal {
	 private String name;
	 private String breed;

	public Animal(String name,  String breed) {

		this.setName(name);
		this.setBreed(breed);
		

	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
