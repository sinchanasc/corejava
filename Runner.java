public class Runner{
	public static void main(String[] args){
		
		Television television1 = new Television("gold", 48, 46, 5k, 5, "Blue", 2019, 150);
		System.out.println(television1.brand);
		
		Television television2 = new Television("Skyworth", 32, 56, 2k, 6, "White", 2018, 157);
		System.out.println(television2.size);

        Television television3 = new Television("Sony", 38, 45, 6k, 7, "Gray", 2016, 156);
		System.out.println(television3.volume);
        
        Television television4 = new Television("LG", 50, 62, 8k, 8, "Blue", 2022, 170);
		System.out.println(television4.resolution);	
        
        Television television5 = new Television("Samsung", 42, 57, 4k, 9, "Lightblue", 2017, 162);
		System.out.println(television5.size);

        televison.playMovie();
		televison.channelChange();
		televison.volume();
		televison.playSong();
        		
		
	}
}
	class Television{
		String brand;
		int size;
		int volume;
		int resolution;
		int channel;
		String color;
		int modelYear;
		String proessor;
		int screenSize;
		
		static{
			System.out.println("static block");
			inputSource=("HDMI");
			Syste.out.printl(inputSource);
		}
		
		public static void playmovie(){
			System.out.println("Static method");
		}
		
		public static void changeChannels(){
			system.out.println("Static method");
		}
		
		public static void volume(){
		   system.out.println("Static method");
		}
		
		public static void playSong(){
			System.out.println("Static method");
		}
		
			
		
		public Television(String brand,int size,int volume,int resolution, int channel,String color,int modelYear,int screenSize){
			this.brand=brand;
			this.size=size;
			this.volume=volume;
			this.resolution=resolution;
			this.channel=channel;
			this.color=color;
			this.modelYear=modelYear;
			this.screenSize=screenSize;
			
		}
		
	}
		