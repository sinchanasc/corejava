package com.xworkz.repository.app.olympic;

public class OlympicRepositoryImpl implements OlympicRepository{
	
	private int[] year = new int[TOTAL_YEAR];
	private int index = 0;

	@Override
	public void save(int year) {
		if(index < TOTAL_YEAR) {
			this.year[index] = year;
			System.out.println("Olympic year saving at index " + index + " is " + year);
			index = index + 1 ;
			System.out.println("Updated index is " + index);
		}
		else {
			System.err.println("Index limit exceeded no more added");
		}
		
	}

	@Override
	public void display() {

		for(int start=0; start<TOTAL_YEAR; start++) {
			System.out.println("Olympic at index " + start + " is " + "year:" + this.year[start] );
		}
		
	} 

}
