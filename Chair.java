public class Chair{
	char grade;
	int noOfFloors;
	String name;
	float height;
	long usn;
	
	public Chair()
	{
		System.out.println("chair constructor");
	    System.out.println(grade);
		System.out.println(noOfFloors);
	    System.out.println(name);
		System.out.println(height);
		System.out.println(usn);
	}
	
	public Chair(char grades,int noOfFloorss,String names,float heights,long usns)
	{
		System.out.println("parameterised constructor");
		grade = grades;
		noOfFloors = noOfFloorss;
		name = names;
		height = heights;
		usn = usns;
	}
	
	public static void main(String[] args){
		new Chair();
		System.out.println("-------------------------");
		Chair chair = new Chair('A',4,"harsh",5.2f,75234l);
		System.out.println(chair.grade);
		System.out.println(chair.noOfFloors);
		System.out.println(chair.name);
		System.out.println(chair.height);
		System.out.println(chair.usn);
	}
}
		