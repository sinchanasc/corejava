package com.xworkz.repository.runner;

import com.xworkz.repository.app.olympic.OlympicRepository;
import com.xworkz.repository.app.olympic.OlympicRepositoryImpl;


public class OlympicRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Olympic Runner\n");
		
		OlympicRepository repository = new OlympicRepositoryImpl();
		
		repository.save(2000);
		repository.save(2006);
		repository.save(2008);
		repository.save(2016);
		repository.save(2021);

		System.out.println("*******************************");
		
		repository.display();
	}
	

}
