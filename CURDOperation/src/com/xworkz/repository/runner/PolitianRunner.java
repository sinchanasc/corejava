package com.xworkz.repository.runner;
import com.xworkz.repository.app.politian.PolitianRepository;
import com.xworkz.repository.app.politian.PolitianRepositoryImpl;


public interface PolitianRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Politician Runner\n");
		
		PolitianRepository repository =  new PolitianRepositoryImpl();
		repository.save("BSY");
		repository.save("HDK");
		repository.save("Siddu");
		repository.save("DKS");
		repository.save("DK Suresh");
		
		System.out.println("**************************");
		
		repository.display();
	}

}
