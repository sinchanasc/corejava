package com.xworkz.things;

public class Nike extends Shoe {
		
	    String ceo;
		String brandAmbassador;
		
		public Nike(int price,ShoeSize size,ShoeColor color,String ceo,String brandAmbassador) {
			super(price,size,color);
			this.brandAmbassador=brandAmbassador;
			this.ceo=ceo;
		}
	 void printInfo() {
		 System.out.println(this.price);
		 System.out.println(this.size);
		 System.out.println(this.color);
		 System.out.println(this.brandAmbassador);
		 System.out.println(this.ceo);
		 
	 }
	}



