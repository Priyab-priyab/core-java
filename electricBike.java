public class electricBike{
	static int price;
	static String brand;
	String batteryLife;
	String batteryName;
	int motorCapacity;
	int WeightCapacity;
	int qualityOfFrame;
	int SizeOfWheels;
	String TypeOfDisplay;
	static int speed;
	int chargingTime;
	int warranty;
	int milage;
	int weightOfBike;
    String typeOfLights;
	int hornSound;
	String typeOfBrakes;
	int range;
	String typeOfHandelers;
	String typOfTires;
	
	public electricBike(int price, String brand, int speed)
	{
		this.price = price;
		this.brand = brand;
		this.speed = speed;
	}
	
	public static void transportation(){
	}
	public static void cycling(){
	}
	public static void Light(){
	}
	public static void produceHorn(){
	}
	public static void groupRides(){
	}
	public static void exercise(){
	}
	public static void carryThings(){
	}
	public static void sports(){
	}
	public static void riseSpeed(){
	}
	public static void onAndOff(){
	}
	
	
	
	public static void main(String[] args)
	{
		electricBike bike = new electricBike(78000, "honda", 60);
		
		System.out.println(electricBike.price);
		System.out.println(electricBike.brand);
		System.out.println(electricBike.speed);
	
	}
}

	
 