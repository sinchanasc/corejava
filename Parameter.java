public class Parameter{
	public static void main(String[] args){
		
		boolean returnedresult = isPrimeNumber(91);
		System.out.println(returnedresult);
		char returnScore = getGrade(60);
		System.out.println(returnScore);
		boolean returnValue = isEven(12);
		System.out.println(returnValue);
		int returnNumber = addition(10,5);
		System.out.println(returnNumber);
		boolean returnName = checkStudentName("harshi");
		System.out.println(returnName);
		long returnNumber2 = getLargeNumber(40,20);
		System.out.println(returnNumber2);
		int returnValue2 = isPositive(30);
		System.out.println(returnValue2);
		short returnValue3 = isNegative(-20);
		System.out.println(returnValue3);
		long returnNumber3 = getSmallNumber(50,20);
		System.out.println(returnNumber3);
		String returnValue4 = isOdd(7);
		System.out.println(returnValue4);
	}
		
    public static boolean isPrimeNumber(int number)
	{	
		if(number%2==0)
		{
			System.out.println("number is the prime number");
		    return true;
	}    
		else
		{
			System.out.println("number is not prime number");
			return false;
		}
	}


    public static char getGrade(int score)
	{
		if(score>=60)
		{
			System.out.println("pass");
			return 60;
		}
		else
		{
			System.out.println("fail");
			return 0;
		}
	}
	
    public static boolean isEven(int number)
	{	
		if(number%2==0)
		{
			System.out.println("number is even");
		    return true;
	}    
		else
		{
			System.out.println("number is not even");
			return false;
		}
	}
		
    public static int addition(int x,int y)
	{
		int z=x+y;
		if(z>0)
		{
			System.out.println("addition is valid");
		    return z;
		}
		else
		{
			System.out.println("addition is not valid");
		    return 0;
		}
	}
	
	public static boolean checkStudentName(String name)
	{
		if(name.length() >= 5)
		{
			System.out.println("name is valid");
			return true;
		}
		else
		{
			System.out.println("name not valid");
			return false;
		}
	}
	
	public static long getLargeNumber(int num1,int num2)
	{
		if(num1>num2)
		{
			System.out.println("number is large");
		    return num1;
		}
		else
		{
			System.out.println("number is not large");
		    return num2;
		}
	}
	
	public static int isPositive(int number)
	{	
		if(number>0)
		{
			System.out.println("number is positive");
		    return 1;
	}    
		else
		{
			System.out.println("number is not positive");
			return 0;
		}
	}
	
	public static short isNegative(int number)
	{	
		if(number<0)
		{
			System.out.println("number is negative");
		    return 1;
	}    
		else
		{
			System.out.println("number is not negative");
			return 0;
		}
	}
	
	public static long getSmallNumber(int number1,int number2)
	{
		if(number1<number2)
		{
			System.out.println("number is small");
		    return number1;
		}
		else
		{
			System.out.println("number is not small");
		    return number2;
		}
	}
	
	public static String isOdd(int number)
	{	
		if(number%2==0)
		{
			System.out.println("number is odd");
		    return "odd";
	}    
		else
		{
			System.out.println("number is even");
			return "even";
		}
	}
		
}


			
		