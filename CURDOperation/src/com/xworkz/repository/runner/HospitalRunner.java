package com.xworkz.repository.runner;

import com.xworkz.repository.app.hospital.HospitalRepository;
import com.xworkz.repository.app.hospital.HospitalRepositoryImpl;

public class HospitalRunner {
	public static void main(String[] args) {
		System.out.println("Running main in Hospital Runner\n");

		HospitalRepository repository = new HospitalRepositoryImpl();
		repository.save("Megan hospital");
		repository.save("Jaydeva hospital");
		repository.save("Manipal hospital");
		repository.save("Subbayya hospital");
		repository.save("Nanjappa hospital");

		System.out.println("**************************");

		repository.display();

	}

}
