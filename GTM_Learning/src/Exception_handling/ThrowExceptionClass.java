package Exception_handling;

import java.util.Scanner;

public class ThrowExceptionClass 
{
	public static void main(String[] args) 
	{
		try 
		{
			int a = 1/1; // its 1 so try will exceute
			//int b = 1/0; // its infinite so catch will execute - even if the above line is positive and if the next line is negative the catch will execute not the positive line
			
			System.out.println(a);
		}
		catch(ArithmeticException a1) 
		{
			System.out.println("exception handled");
		}
	}
		
		
	
			
			
		
	

}
