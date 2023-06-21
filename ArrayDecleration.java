public class ArrayDecleration
{
	public static void main(String[] args)
	{
		int[] noOfStudents={10,20,30,50,80};
			{
				System.out.println(noOfStudents[0]);
				System.out.println(noOfStudents[1]);
				System.out.println(noOfStudents[2]);
				System.out.println(noOfStudents[3]);
				System.out.println(noOfStudents[4]);
		    }
		char[] vowels={'a','e','i','o','u'};
			{
				System.out.println(vowels[0]);
				System.out.println(vowels[1]);
				System.out.println(vowels[2]);
				System.out.println(vowels[3]);
				System.out.println(vowels[4]);
			}
		
        float[] heightOfStudents = {6.2f , 3.5f , 5.2f , 4.8f};
			{
       
				System.out.println(heightOfStudents[0]);
				System.out.println(heightOfStudents[1]);
				System.out.println(heightOfStudents[2]);
				System.out.println(heightOfStudents[3]);
			}	
	    		
		int[] noOfSubjects = new int[5];
		{
			noOfSubjects[0] = 10;
			noOfSubjects[1] = 15;
			noOfSubjects[2] = 20;
            noOfSubjects[3] = 21;
			noOfSubjects[4] = 25;
			{
				System.out.println(noOfSubjects[0]);
				System.out.println(noOfSubjects[1]);
				System.out.println(noOfSubjects[2]);
				System.out.println(noOfSubjects[3]);
				System.out.println(noOfSubjects[4]);
			}
		}
		
		float[] weight = new float[4];
		{
			weight[0] = 60.5f;
			weight[1] = 54f;
			weight[2] = 47.5f;
			{
				System.out.println(weight[0]);
				System.out.println(weight[1]);
				System.out.println(weight[2]);
			}
		}
		
		

		char[] gradeOfStudents = new char[3];
		{
			gradeOfStudents[0] = 'A';
			gradeOfStudents[1] = 'B';
			gradeOfStudents[2] = 'C';
			{
				System.out.println(gradeOfStudents[0]);
				System.out.println(gradeOfStudents[1]);
				System.out.println(gradeOfStudents[2]);
			}	
		}
		
		
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
	
}	