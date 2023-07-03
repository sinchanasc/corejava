public class Drone{
	int batterBackup;
	String brand;
	int price;
	int flyForward;
	int flyBackword;
	int rotateLeft;
	int rotateRight;
	String processor;
	short land;
	int imageCapture;
	int vedioRecording;
	int objectTracking;
	int poweredOff;
	int poweredOn;
	int storageCapacity;
	int ram;
	int cameraSpec;
	String color;
	int sound;
	int takeOff;
	
	public Drone(String brand,int price,String processor){
		this.brand=brand;
		this.price=price;
		this.processor=processor;
	}
		
		public static void aerialPhotography(){
		}
		public static void delivery(){
		}
		public static void fliming(){
		}
		public static void cinematography(){
		}
		public static void trafficMonitoring(){
		}
		public static void Events(){
		}
		public static void geoLocation(){
		}
		public static void mapping(){
		}
		public static void inspection(){
		}
		public static void fly(){
		}
		
	
		
		public static void main(String[] args){
			Drone drone = new Drone("DJI",95000,"qualcomm snapdragon");
			System.out.println(drone);
			System.out.println(drone.brand);
			System.out.println(drone.price);
			System.out.println(drone.processor);
		}
	
}
		