public class Institute{
public static void main(String[] arrgs){
	add(10,5);//executing with int,int values
    add(10,5,10);//executing with int,int,int values
	add(10,5.2f);//executing with int,float values
	add(30,(short)20);//executing with int,short values
	add(20,(byte)10);//executing with int,byte values
	add((short)10,35);//executing with short,int values
    getSubtraction(20,10);//executing with int,int values
	getSubtraction(20,10,5);//executing with int,int,int values
	getSubtraction((byte)10,(short)10);//executing with byte,short values 
	getSubtraction(20,(short)5);//executing with int,short values
	getSubtraction(30,(byte)10);//executing with int,byte values 
	getSubtraction((byte)20,20);//executing with byte,int values 
	getInformation("harsh");//executing with string value
	getInformation("priya","patil");//executing with string,string values
	getInformation("bhoomi",28);//executing with string,int values
	getInformation("chandhu",(byte)24);//executing with string,byte values
	getInformation(45.6f,60);//executing with float,int values
	getInformation(75,60.4f);//executing with int,float values 
}

public static int add(int value1,int value2)
{
	int value3 = value1 + value2;
	System.out.println("added number");
	return value3;
}

public static int add(int value1,int value2,int value3)
{
	int value4 = value1 + value2 + value3;
    System.out.println("added number2");	
	return value4;
	
}

public static float add(int value1,float value2)
{
	float value3 = value1 + value2;
	System.out.println("added number3");
	return value3;
}

public static int add(int value1,byte value2)
{
	int value3 = value1 + value2;
	System.out.println("added number4");
	return value3;
}

public static int add(int value1,short value2)
{
	int value3 = value1 + value2;
	System.out.println("added number5");
	return value3;
}

public static int add(short value1,int value2)
{
	int value3 = value1 + value2;
	System.out.println("added number6");
	return value3;
}


public static void getSubtraction(int a,int b)
{
	System.out.println(a-b);
}

public static void getSubtraction(int a,int b,int c)
{
	System.out.println(a-b-c);
}


public static void getSubtraction(byte a,short b)
{
	System.out.println("subtraction method1");

}

public static void getSubtraction(int a,short b)
{
	System.out.println("subtraction method2");

}


public static void getSubtraction(int a,byte b)
{
	System.out.println("subtraction successfull");

}

public static void getSubtraction(byte a,int b)
{
	System.out.println("subtraction successfull2");

}

public static void getInformation(String name)
	{
		System.out.println("information true");
	}
	public static void getInformation(String name,String lastname )
	{
		System.out.println("information not true");
	}
	public static void getInformation(String name , int id)
	{
		System.out.println("information matched");
	}
	public static void getInformation(String name , byte id)
	{
		System.out.println("information not mathced");
	}
	public static void getInformation(float value1 , int value2)
	{
		System.out.println("information valid");
	}
	public static void getInformation(int value1 , float value2 )
	{
		System.out.println("information not valid");
	}

}


