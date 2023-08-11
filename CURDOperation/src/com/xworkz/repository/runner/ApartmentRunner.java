package com.xworkz.repository.runner;

import com.xworkz.repository.app.apartment.ApartmentRepository;
import com.xworkz.repository.app.apartment.ApartmentRepositoryImpl;

public class ApartmentRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Apartment Runner");
		
		ApartmentRepository repository = new ApartmentRepositoryImpl();
		repository.save("Studio Apartment ");
		repository.save("Alcove Apartment ");
		repository.save("Convertible Apartment ");
		repository.save("Micro Apartment");
		repository.save("Loft Apartment ");
		
		System.out.println("*******************************");
		
		repository.display();


}
}
