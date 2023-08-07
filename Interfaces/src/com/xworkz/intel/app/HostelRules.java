package com.xworkz.intel.app;

public class HostelRules implements Hostel {
	  
		@Override
		public void getFee() {
			System.out.println("invoking the hostel fees");
			
		}
		@Override
		public void getDonotDoRagging() {
			System.out.println("invoking ragging in hostel");
		} 

}
