public class Car{
	int price;
	int warranty;
	static int numberOfWheels;
	static boolean  staring;
	static int numberOfMirrors;
	String color;
	String brand;
	String model;
	static String type;
	static boolean hasDikki;
	
	static{
		numberOfWheels=4;
		staring = true;
		numberOfMirrors =3;
		type ="cars";
		hasDikki = true;
		
	}
	
	public Car(int price,int warranty,String color,String brand,String model )
	{
		this.price=price;
		this.warranty=warranty;
		this.color=color;
		this.brand=brand;
		this.model=model;
		
	}
	
	public static void main(String[] args)
	{
		Car car = new Car(500000,5,"Red","Hond","Honda civic");
		
		System.out.println(car.price);
		System.out.println(car.warranty);
		System.out.println(car.color);
		System.out.println(car.brand);
		System.out.println(car.model);
		
		
		Car car1 = new Car(1000000,10,"blue","BMW","BMW-3");
		System.out.println(car1.price);
		System.out.println(car1.warranty);
		System.out.println(car1.color);
		System.out.println(car1.brand);
		System.out.println(car1.model);
		
		
		Car car2 = new Car(700000,8,"black","toyota","toyota camry");
		
		System.out.println(car2.price);
		System.out.println(car2.warranty);
		System.out.println(car2.color);
		System.out.println(car2.brand);
		System.out.println(car2.model);
		
		
		Car car3 = new Car(300000,4,"white","kia","kia optima");
		
		System.out.println(car3.price);
		System.out.println(car3.warranty);
		System.out.println(car3.color);
		System.out.println(car3.brand);
		System.out.println(car3.model);
		
		
		Car car4 = new Car(600000,3,"yellow","audi","audi A4");
		
		System.out.println(car4.price);
		System.out.println(car4.warranty);
		System.out.println(car4.color);
		System.out.println(car4.brand);
		System.out.println(car4.model);
		
	}
	
	
}