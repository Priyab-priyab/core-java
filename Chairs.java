

	public class Chairs	{
		int marks;
		char grade;
		String name;
		boolean check;
		float percentage;
		
		public Chairs()
		{
			System.out.println("default constructor");
			System.out.println(name);
			System.out.println(marks);
			
		}
		public Chairs(int markss,char gradess,String names,boolean checks,float percentages)
		{
			System.out.println("chair method");
			marks = markss;
			grade = gradess;
			name = names;
			check = checks;
			percentage = percentages;
	
		}
		
		public static void main(String[] args)
		{
			 new Chairs();
			 System.out.println("------------");
			Chairs c = new Chairs(80,'a',"priya",true,87.2f);
			Chairs c1 = new Chairs(90,'A',"nayana",false,94.5f);
			System.out.println(c.marks);
			System.out.println(c.grade);
			System.out.println(c.name);
			System.out.println(c.check);
			System.out.println(c.percentage);
			
			System.out.println(c1.marks);
			System.out.println(c1.grade);
			System.out.println(c1.name);
			System.out.println(c1.check);
			System.out.println(c1.percentage);
			
		}
	}
	
			
	
	
	



