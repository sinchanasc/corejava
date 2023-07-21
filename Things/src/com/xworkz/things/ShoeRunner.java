package com.xworkz.things;

public class ShoeRunner {
public static void main(String[] args) {
    	
    	Puma shoe2=new Puma(3000,ShoeSize.FIVE,ShoeColor.GRAY,"Puma x one8","Bavaria");
        shoe2.printInfo();
        
        Nike shoe3=new Nike(6000,ShoeSize.EIGHT,ShoeColor.BLACK,"John Donahoe","Cristiano Ronaldo");
        shoe3.printInfo();
    }
}


