package com.xworkz.repository.app.army;

public class ArmyImpl implements Army{
	
	private String names[] = new String[TOTAL_VALUE];
	
	private int startIndex = 0;

	@Override
	public void save(String name) {
		if(startIndex < TOTAL_VALUE) {
			this.names[startIndex] = name ;
			System.out.println("Name saved at " + startIndex + " is " + name);
			startIndex = startIndex + 1;
			System.out.println("Updated index is " + startIndex);
		}
		else {
			System.err.println("Index limit exceeded, Cannot store more names");
		}
	}

	@Override
	public void display() {
		for(int index=0; index<TOTAL_VALUE; index++) {
			System.out.println("Name at Index " + index + " is " + names[index]);
			
		}
		
	}
 

}
