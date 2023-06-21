public class Methods{
	public static void main(String[] args){
		temprature();
		weight();
		mobiles();
		employees();
		books();
		
	}
	
	public static void temprature(){
	float[] temprature={26.2f,30.5f,38.3f,42.4f};
	for(int i=0;i<temprature.length;i++){
    System.out.println(temprature[i]);
		}
    }
	
    public static void weight(){
	    float[] weightOfStudents={35.2f,42.5f,48.3f,52.4f};
	    for(int i=0;i<weightOfStudents.length;i++){
		System.out.println(weightOfStudents[i]);
		}
	}
	

    public static void mobiles(){
	    int[] priceOfMobiles={10000,20000,25000,30000};
	    for(int i=0;i<priceOfMobiles.length;i++){
		System.out.println(priceOfMobiles[i]);
		}
	}
	
	public static void employees(){
	    int[] totalNumberOfEmployees={10,15,20,35};
	    for(int i=0;i<totalNumberOfEmployees.length;i++){
		System.out.println(totalNumberOfEmployees[i]);
		}
	}
	
	public static void books(){
	    char[] nameOfBooks={'a','b','c','d'};
	    for(byte i=0;i<nameOfBooks.length;i++){
		System.out.println(nameOfBooks[i]);
		}
	}
}
	
	