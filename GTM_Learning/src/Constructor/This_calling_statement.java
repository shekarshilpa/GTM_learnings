package Constructor;

public class This_calling_statement 
{
	 This_calling_statement(int a) 
	 	{
		 	System.out.println("1");
	 	}
	 This_calling_statement(int a, int b) 
		{
		 	this(100);
		 	//int sum = a+b;
		 	System.out.println("2");

		}
	 This_calling_statement(int a, double b) 
		{
		 	this(10, 20); //calling the constructor within the same class with matching arguments
		 	System.out.println("3");

		}
	 This_calling_statement() 
		{
		 	System.out.println("4");

		}
	public static void main(String[] args) 
	{
		This_calling_statement t1 = new This_calling_statement(10,3.14);
		This_calling_statement t2 = new This_calling_statement();
		
		
	}

}
