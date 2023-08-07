package com.xworkz.intel.app;

public class AirportRule  implements Airport {
	  
		@Override
		public void getLimitsLiquids() {
			System.out.println("invoking the airport in limit liquids");
		}

		@Override
		public void getBodyScanners() {
			System.out.println("invoking in airports body scanners");
		} 

}
