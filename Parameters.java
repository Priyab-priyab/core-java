public class Parameters
{
	public static void main(String[] args)
	{
		byte MyAge = age(2);
		System.out.println(MyAge);
		
		short correctPassword = password(2554);
		System.out.println(correctPassword);
		
		int result = multiplication(10,5);
		System.out.println(result);
		
		long myNumber = phoneNumber(8296296466L);
		System.out.println(myNumber);
		
		percentage(87.2f);
		
		String MyName = name("priyanka" );
		
		gender('f');
		
		boolean validity = check(true);
		System.out.println(validity);
		
		priceOfRice(1.230);
		
		colourRGB("blue");
	}
	
	
	
	public static byte age(int b)
	{
		if(b >0 && b <=1)
		{
			System.out.println("your are childern");
			return 0;
		}
		else if(b >1 && b <3)
		{
			System.out.println("you are teenaged "+b);
			return 1;
		}
		else
		{
			System.out.println("you are elder");
			return 2;
		}
		
	}
	
	public static short password(int s)
	{
		if(s>0)
		{
			System.out.println("password is"+s);
			return 1;
		}
		else
		{
			return 0;
		}
	}
			
	
	
	public static int multiplication(int a,int b)
	{
		int c = a*b;
		
		if(c!=0)
		{
			System.out.println(" multiplied value is "); 
			return c;
		}
		else
		{
			return a;
		}
	}
	
	
	public static long phoneNumber(long L)
	{
		if (L>0)
		{
			System.out.println("my phone number is");
			
		}
		else 
		{
			System.out.println("not my number");
		}
		return L;
		
	}
	
	
	public static float percentage(float f)
	{
		if(f>=35.0f && f<60.0f)
		{
			System.out.println("just pass"+f);
			return f;
		}
		else if(f>60f && f<=100f)
		{
			System.out.println("highest ranking"+" "+f);
			return f;
		}
		else 
		{
			System.out.println("fail"+f);
			
		}
		return f;
	}
	
	
	public static String name(String n)
	{
		if(n=="priya" )
		{
			System.out.println("yes my name is priya");
			return n;
		}
		else
		{
			System.out.println(n+" "+" is not my name");
		}
		return n;
	}
	
	
	public static char gender(char a)
	{
		if(a=='f')
		{
			System.out.println(a+" "+"means female");
		}
		else if(a=='m')
		{
			System.out.println(a+" "+"means male");
		}
		else
		{
			return a;
		}
		return a;
	}
	
	public static boolean check(boolean b)
	{
		if(b== true)
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
		return b;
	
	}
	
	public static double priceOfRice(double d)
	{
		if(d == 1.230)
		{
			System.out.println("correct price");
		}
		else
		{
			System.out.println("incorrect price");
		}
		return d;
	}
	
	public static String colourRGB(String s)
	{
		if(s=="red" || s=="blue" || s=="green")
		{
			System.out.println(s+" " +" is rgb colour");
			return s;
		}
		else
		{
			System.out.println(s+" "+"not rgb colour");
			
		}
		return s;
	}
			
			
		
	
}