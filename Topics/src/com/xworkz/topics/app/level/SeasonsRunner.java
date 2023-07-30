package com.xworkz.topics.app.level;

import com.xworkz.topics.app.Seasons;
import com.xworkz.topics.app.Summer;
import com.xworkz.topics.app.Sunny;

public class SeasonsRunner {

	public static void main(String[] args) {
		
		Seasons season = new Seasons(3);
		season.types();
		Summer.cast(season);
		
		Summer sun = new Summer(1);
		sun.method();
		
		Sunny sunny = new Sunny();
		Sunny.printInfo();
		
	}

}
