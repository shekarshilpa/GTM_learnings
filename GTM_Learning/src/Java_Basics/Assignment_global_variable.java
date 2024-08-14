package Java_Basics;

public class Assignment_global_variable
{
		  static int a=10;
		  static int b=20;
		
		public static void add() 
		{
			int sum=a+b;
			System.out.println(sum);
			
		}
		public void sub() 
		{
			int sum=a-b;
			System.out.println(sum);
			
		}
		public void mul() 
		{
			int sum=a*b;
			System.out.println(sum);
			
		}
		public void div() 
		{
			int sum=a/b;
			System.out.println(sum);
			
		}
		public void mod() 
		{
			int sum=a%b;
			System.out.println(sum);
			
		}
	public static void main(String[] args) 
	{
		
		Assignment_global_variable ag = new Assignment_global_variable();
		Assignment_global_variable.add();
		ag.sub();
		ag.div();
		ag.mul();
		ag.mod();
	}

}
