public class MethodDecleration1
{
	public static void main(String[] args)
	{
		numbers();
		values();
		digits();
		mymethod();
		letter();
		
		
		
	}
	public static void numbers()
	{
		int[] evenNumbers = {10,25,65,43,85,96,45,74,18};
			{
				for(int i = 0;i<evenNumbers.length;i++)
				{
					System.out.println(evenNumbers[i]);
				}
			}
	}
	
	
		
	public static void values()
	{
		float[] heightOfStudents = {6.2f , 3.5f , 5.2f , 4.8f};
			{
				for(int i=0;i<heightOfStudents.length;i++)
				{
					System.out.println(heightOfStudents[i]);
				}
			}
	}
	public static void digits()
	{
		byte[] valuesOfDigits={5,7,6,8,2,5};
			{
				for(int i=0;i<valuesOfDigits.length;i++)
				{
					System.out.println(valuesOfDigits[i]);
				}
			}
	}
	
	public static void mymethod()
	{
		boolean[] iAmGood = new boolean[5];
		{
			iAmGood[0] = true;
			iAmGood[1] = false;
			iAmGood[2] = true;
			iAmGood[3] = false;
			iAmGood[4] = true;
			
			for(int i =0; i<=iAmGood.length-1; i++)
			{
				System.out.println(iAmGood[i]);
			}
		}
	}
	
	public static void letter()
	{
		char[] vowel = new char[5];
		{
			vowel[0]='a';
			vowel[1]='e';
			vowel[2]='i';
			vowel[3]='o';
			vowel[4]='u';
		   
		    for(int i=4;i>=0;i--)
				{
					System.out.println(vowel[i]);
				}
			
		}
	}	
	
	
}
	
				
			
				
		
				
				
			
	
	
	
	
	

		