aptitude
1. d
2. b
3. a
4. c
5. d
6. a
7. d
8. a
9. a
10. b
11. a
12. c
13. a
14. a

theory

1. constructor is a block of code , which executed when an object is crated.
   *constructor subjectName should be same as the class subjectName.
   *constructor should not use explicit type.
   *constructor not have static and final keywords
   ex:
      public class Constructor{
		  int price;
		  
	  public Constructor{
		  System.out.println("deafault constructor);
	  }	  
	  }
	  public static void main(String[] args){
		  Constructor c = new Constructor
	  }
----------------------------------------------------------------
2. types of constructor
   
   a)deafault constructor
   b)parameterised constructor
   
   a)deafault constructor:  it is a constructor called automatically when the objct is created
                            there is parameters in deafault constructor
							
   b) parameterized constructor: it is  constructor contains the parameters					
   
----------------------------------------------------------------------

3. object 
          it is instances of class  
          it is a realtime entity 
          it has states and behaviour
		  we call the object using new keyword
        

        syntax :
               classsubjectName(object) referencesubjectName = new classsubjectName(object)		
   
------------------------------------------------------------------------------------------------- 

4. class    
          it is blueprint of an object.
		  it is a design of an object.
		  the class can contains - fields.
		                           methods.
								   inner class.
								   constructor
		  
          one  .java file can contain n number of class
 		  
----------------------------------------------------------------------------

5. method ovrloading
           
               it as the same method subjectName but different parameters.
               parameters can --			   
                                  having multiple parameters.
								  having differnt types of data types.
								  having changing order of parameters

----------------------------------------------------------------------------
6. variables
             variables are the container to store the values.
			 
			 they are 3 types of variables-
			                           a) class variables -
									                      these variables  are in inside a class and outside method 
														  and with the static keyword.
														  
										b) instance variable -
                                                            these variables are in inside a class and outside method 
														  and without the static keyword.										
			                  
							            c) local variabls -
										                  these variables  are in inside a method and outside class 
														  
-------------------------------------------------------------------
7. this
          this keyword refers to the current object of the method or constructor
		  this is a keyword is used to diffrnciate the class variables and local variables.
          it represnts that we are using the main class variables.

------------------------------------------------------------------------------

8. strings
            strings are the sequence of charactres
            we use string using literals and new keyword

         ex 1 using literals:
             		 string s = "priya";
		 
		 ex 2 using new keyword:
		            string s = new string("priya");
					
-------------------------------------------------------------------
9. methods of string :
                
                1) replace - used to repalce the caharcter in string
                              	
                        ex - subjectName = "Priya"
     						string s =	subjectName.replace('P','R');

				2)toUpperCase - it converts the given string into uppercase letter string			
		                    string s =	subjectName.toUpperCase();
							
							
                 3)toLowerCase - it converts the given string into lowercase letter string			
		                    string s =	subjectName.tolowerCase();
							
				 4)startWith - it adds the characters to the starting of the given string			
                               string s = subjectName.startWith("hello");
							   
			     5)endWith - it adds the characters to the ending of the given string			
                               string s = subjectName.endWith("bai");
------------------------------------------------------------------------------
10. string is immutable 
                    because onece the entered string is not changed only the address the string is changed

---------------------------------------------------------------------------------------------------------------------

programming

1. public class Test{
		int totalMarks;
		String subjectName;
		int time;
		
		
		public Test()
		{
			System.out.println("default");
			
		}
		public Test(int totalMarks,String subjectName)
		{
			this.totalMarks = totalMarks;
			this.subjectName = subjectName;
		}
		
		public static void main(String[] args)
		{
			 new Test();
			System.out.println("parameterised");
			Test test = new Test(95,"nayana");
			System.out.println(test.totalMarks);
			System.out.println(test.subjectName);
			
		}
	}
----------------------------------------------------------------------------------	
2.  	
	public class Test{
		int totalMarks;
		String subjectName;
		String gives;
		
		
		public Test()
		{
			System.out.println("default");
			
		}
		public Test(int totalMarks,String subjectName)
		{
			this.totalMarks = totalMarks;
			this.subjectName = subjectName;
		}
		
		public static void gives(){
			
		}
		
		public static void main(String[] args)
		{
			 new Test();
			 System.out.println("parameterised");
			Test test = new Test(100,"java");
			System.out.println(test.totalMarks);
			System.out.println(test.subjectName);
			
		}
	}

--------------------------------------------------------------------------
3. 	public class Fish {
	
	public static void main(String[] args){
		Fish f = new Fish();
		Camera c = new Camera();
		Headphones h = new Headphones();
	}
}

 class Camera {
	 System.out.println("camera class");
 }
 
 class Headphones{
	 System.out.println("headphons class");
	 
 }
 
	
	

	
---------------------------------------------------------------
4. public class ForLoop {
	public static void main(String[] args)
	{
		int[] values = {10,20,30,40,50}
			{
				for(int i =4; i<=values.length-1; i--)
					{
						System.out.println(values[i]);
					}
			}
	}
		      
					

					
			