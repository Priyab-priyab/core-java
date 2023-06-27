public class Institute{
	public static void main(String[] args){
		
		int addedValue = add(20,15);      //int,int values
		System.out.println(addedValue);
		
		int addedValue1 = add(20,15,10);   //int,int,int values
		System.out.println(addedValue1);
		
		
		float addedValue2 = add(10,5.5f);   //int,float values
		System.out.println(addedValue2);
		
		long addedValue3 = add(10,5555L);   //int,long values
		System.out.println(addedValue3);
		
		long addedValue4 = add(5,(short)20,1111L);   //int,short,long values
		System.out.println(addedValue4);
		
		long addedValue5 = add(2525l,(short)10,50);   //long,short,int values
		System.out.println(addedValue5);
		
		name("priya");       // string
		
		name("priya",'f');   // string,char
		
		name("nayana",true);  //string, boolean
		
		name("mamatha",87.2f); //string ,float
		
		name("basavaraju",94.2f,3.14528d);  // string,float,double
		
		name(94.2f,3.14528d,"basavaraju");  // float,double,string
		
		boolean value = check(true,(byte)12); // boolean,byte
		System.out.println(value);
		 
		check(true,'A');      // boolean,char
		
		check(true,"priya");  //boolean,string
		
		check(true,false);   //boolean,boolean
		
		check(true,'B',82962964l);  //boolean,char,long
		
		check(82962964l,true,'C');  //long,boolean,char


		
	}
	
	
	public static int add(int x, int y){
		int z = x+y;
		System.out.println("addition of 2 number ");
		return z;
	}
	
	
	public static int add(int x, int y, int z){
		int a = x+y+z;
		System.out.println("addition of 3 number");
		return a;
	}
	
	public static float add(int x, float y){
		float a = x+y;
		System.out.println("addition of floating number");
		return a;
	}
	
	public static long add(int x, long y){
		long a = x+y;
		System.out.println("addition of long number");
		return a;
	}
	
	public static long add( int x,short y,long z){
		long a = x+y+z;
		System.out.println("addition of 3 different number");
		return a;
	}
	
	public static long add( long x,short y,int z){
		long a = x+y+z;
		System.out.println("addition of 3 mix number");
		return a;
	}
	
	
	public static String name(String s){
		System.out.println("my name");
		return s;
	}
	
	public static String name(String s, char n){
		System.out.println("my name and gender");
		return s;
	}
	
	public static String name(String s, boolean n){
		System.out.println("my name is true");
		return "GOOD";
	}
	
	public static String name(String s, float n){
		System.out.println("my name and percentage");
		return "GOOD";
	}
	
	public static String name(String s, float n, double d){
		System.out.println("my name and percentage and piValue");
		return "GOOD";
	}
	
	public static String name(float n, double d,String s){
		System.out.println("my percentage and piValue and name");
		return "GOOD";
	}
	
	
	public static boolean check(boolean b, byte a){
		if(b==true){
			System.out.println("good morning");
		}
		else{
			System.out.println("bad moring");
		}
		return true;
	}
	
	public static boolean check(boolean b, char c){
		System.out.println("true grade");
		return b;
	}
	
	public static boolean check(boolean b, String c){
		System.out.println("true name");
		return b;
	}
	
	public static boolean check(boolean b, boolean c){
		System.out.println("true false");
		return b;
	}
	
	public static boolean check(boolean b, char c, long l){
		System.out.println("true grade and phone_number");
		return b;
	}
	
	public static boolean check(long l, boolean b, char c){
		System.out.println("phone_number and true grade");
		return b;
	}
}

	
