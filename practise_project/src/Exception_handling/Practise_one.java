package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practise_one
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		try
		{
			System.out.println("enter age");
			int age = s1.nextInt();
			System.out.println(age);
		}
		catch(InputMismatchException e)
		{
			System.out.println("age should be valid and only numbers");
			Scanner s2 = new Scanner(System.in);
			int age = s2.nextInt();
			System.out.println(age);
		}
		
		System.out.println("enter name");
		Scanner s3 = new Scanner(System.in);
		String name = s3.next();
		System.out.println(name);
	}

}
