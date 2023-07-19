public class Fan{
	String brandName;
	int price;
	float consumptionEnergy;
     
	MotorType motors = MotorType.DC;
	Blade noOfBlades= Blade.FOUR;
 public Fan(String brandName, int price, float consumptionEnergy){
	this.brandName=brandName;
	this.price=price;
	this.consumptionEnergy=consumptionEnergy;

}
    public static void main(String[] args) {
       Fan fan = new Fan("Crompton",10000,0.034f);
       System.out.println(fan.brandName);
       System.out.println(fan.price);
       System.out.println(fan.consumptionEnergy);
       System.out.println("******************************************************");
       System.out.println(fan.motors.getValue());
       System.out.println(fan.noOfBlades.getNumber());
       
    }	

    public String getBrandName(){
    	return brandName;
    }
    public int getPrice(){
    	return price;
    	}	
    public float getConsumptionEnergy(){
    	return consumptionEnergy;
    }
    
}

    enum MotorType{
    	AC("Ac"),DC("Dc");
    	String value;
    	   MotorType(String value){
    	   	this.value=value;
    	   }
       public String getValue(){
       	return value;
       }
   }

    enum Blade{
    	THREE(3),FOUR(4),FIVE(5);
    	int number;
    	  Blade(int number){
    	  	this.number=number;
    	  }
       public int getNumber(){
       	return number;
       }
    }