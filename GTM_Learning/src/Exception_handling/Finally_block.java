package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally_block {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		try
		{
			System.out.println("enter valid age");
			int age = s1.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("age shud be valid number");
			Scanner s2  = new Scanner(System.in);
			System.out.println("enter valid age");
			int age1 = s2.nextInt();

		}
		finally
		{
			System.out.println("Finally block will execute no matter what if the exception occurs or does not occur");
		}
		
		System.out.println("enter name");
		Scanner s3 = new Scanner(System.in);
		String name = s3.next();
	}
	}


