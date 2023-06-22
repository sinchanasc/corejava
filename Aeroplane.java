public class Aeroplane{
	public static void main(String[] args){
		
		int multiplevalue=multiply();
		System.out.println("c");
		byte returnedweeks=weeksInMonth();
		System.out.println("a");
		short returnedprice=number();
		System.out.println("40");
		char returnedvowel=vowel();
		System.out.println("i");
		long returnedvalue=usn();
		System.out.println("234622");
		float returnednumber=cgpa();
		System.out.println("1");
		double returnednum=accuracy();
		System.out.println("num");
		boolean returnedstatus=checkTheStatus();
		System.out.println("status");
		String returnedname=nameOfBook();
		System.out.println("name");
		
	}
		
		
	public static int multiply(){
		int a = 10;
		int b = 2;
		int c = a*b;
		return c;
	}
	
	public static byte weeksInMonth(){
		byte b=4;
		return b;
	}
	
	public static short number(){
		short price=40;
		return 1;
		
	}
	
	public static char vowel(){
		System.out.println("method started");
		return 'a';
	}
	
	public static long usn(){
		long usn=234622;
		if(usn>100000){
			return 234622;
		}
		else{
			return 0;
		}
	}
	
	public static float cgpa(){
		float cgpa=9.5f;
		if(cgpa<10){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static double accuracy(){
		double num=45678.656556656565;
		return num;
	}
	
	public static boolean checkTheStatus(){
		boolean status=true;
		return true;
	}
	
	public static String nameOfBook(){
		String name="Ramayana";
		return name;
	}
	
	
}
