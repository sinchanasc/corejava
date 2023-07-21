package com.xworkz.things;

public class ShoeUtil {
	static void buy(Shoe shoe) {
		 if(shoe != null) {
				System.out.println("Price : "+shoe.price);
				System.out.println("Color : "+shoe.color);
				System.out.println("Size : "+shoe.size);
			}
			
			if(shoe instanceof Puma) {
				Puma puma = (Puma)shoe;
				puma.printInfo();
			}
			
			if(shoe instanceof Nike) {
				Nike nike = (Nike)shoe;
				nike.printInfo();
		  
			
			
		}
	 }
	

}
