public class Jeep{
	public static void main(String[]  args){
		
		//Strings created using literals
		String model = "Jeep Wrangler";
		String color = "White";
		String fuelLevel = "Full";
		String year = "2019";
		String doorStatus = "Open";
		String speed = "100mph";
		String headLigth = "off";
		String batterLevel = "70%";
		String seats = "2";
		String price = "80000";
		
		//Strings created using new keyword
		String engineStatus = new String("Idling");
		String connectivity = new String("Bluetooh");
		String noOfWindows = new String("2");
		String fuelType = new String("Diesel");
		String noOfGears = new String("3");
		String airBags = new String("Deployed");
		String temprature = new String("75c");
		String ownerName = new String(" Suresh");
		String handBreak = new String("Activated");
		String noOfWheels = new String("4");
		
		
		String returnedValue = color.trim();
		System.out.println(returnedValue);
		
		String result = model.replace('w','M');
		System.out.println(result);
		
		String value1 = model.toUpperCase();
		System.out.println(value1);
		
		String result2 = model.toLowerCase();
		System.out.println(result2);
		
		boolean result3 = color.startsWith("Black");
		System.out.println(result3);
		
		boolean resultValue = model.endsWith("Grand");
		System.out.println(resultValue);
	}
}
	    
		
		