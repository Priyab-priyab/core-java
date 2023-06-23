 public class ReturnType
 {
	 public static void main(String[] args)
	 {
		greeting(); 
		
		byte ReturnedDigit = digit(); 
		System.out.println(ReturnedDigit);
		 
		short ReturnedValue = value();
		System.out.println(ReturnedValue);
		
		int ReturnedAddition = add();
		System.out.println(ReturnedAddition);
		
		long ReturnedOutput = adhar();
		System.out.println(ReturnedOutput);
		
		float ReturnedHeight = height();
		System.out.println(ReturnedHeight);
		
		double ReturnedAmount = amount();
		System.out.println(ReturnedAmount);
		
		char ReturnedSection = myClass();
		System.out.println(ReturnedSection);
		
		boolean ReturnedOption = gender();
		System.out.println(ReturnedOption);
		
		name();
		
	    colours();
		
	 }
	 
	 public static void greeting()
	 {
		 System.out.println("good morning");
		 
	 }
	 
	 
	 public static byte digit()
	 {
		return 5;
	 }
	 
	 
	 public static short value()
	 {
		 return 83;
	 }
	 
	 
	 public static int add()
	 {
		 int a = 10;
		 int b = 19;
		 int c = a+b;
		 return c;
	 }
	 
	 public static long adhar()
	 {
		 long myAdharNo = 159263487L;
		 
		 if(myAdharNo != 0)
		 {
			System.out.println("valid");
		 }
		 else 
		 {
			 System.out.println("invalid");
		 }
		 return myAdharNo;
		
	 }
	 
	 
	 public static float height()
	 {
		 float myHeight = 5.7f;
		 
		 return myHeight;
	 }
	 
	 
	 public static double amount()
	 {
		 double pricOfChoclate = 56.536984;
		 
		 if(pricOfChoclate > 0)
		 {
			System.out.println("correct price");
	
		 }
		 else
		 {
			 System.out.println("wrongn price");
		 }	
		 return pricOfChoclate;
	 }
	 
	 
	 
	 public static char myClass()
	 {
		 char mySection = 'B';
		 
		 if(mySection != 'B')
		 {
			 System.out.println("not my section");
		 }
		 else{
			 System.out.println("my section");
		 }
		 return 'B';
	 }
	 
	 public static boolean gender()
	 {
		 boolean myGender = true;
		 
		 if(true)
		 {
			System.out.println("female"); 
		 }
		 else
		 {
			 System.out.println("male");
		 }
		 return myGender;
	 }
	 
	 public static String name()
	 {
		 String myName = "priya";
		
		 return myName;
	 }
	 
	 public static char colours()
	 {
		 char rgbColours[]= {'R','B','G'};
		 
		 if(rgbColours[0] == 'R' || rgbColours[1] == 'B' || rgbColours[2] == 'G')
		 {
			 System.out.println(" Colour is rgb");
		 }
		 
		 else
		 {
			 System.out.println(" not RgbColour");
		 }
		 return 'R';
	 }
	 
	 
	 
 }