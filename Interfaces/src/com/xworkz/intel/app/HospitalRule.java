package com.xworkz.intel.app;

public class HospitalRule implements Hospital {
	  
		@Override
		public void getMedicine() {
			System.out.println("Invoking the medicines in hosiptal.");
		}
	    @Override
	    public void getFee() {
	    	System.out.println("Invoking the hospital Fees ");
	    }
 

}
