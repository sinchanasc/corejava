package com.xworkz.repository.app.olympic;

public interface OlympicRepository {
	int TOTAL_YEAR = 5;

	void save(int year);

	void display();

}
