package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_62 {

	public static void main(String[] args) 
	{
Scanner s1 = new Scanner(System.in);
		
		try 
		{
			System.out.println("enter age");
			int age = s1.nextInt();
			System.out.println("enter salary");
			double salary = s1.nextDouble();
			System.out.println("enter weight");
			float weight = s1.nextFloat();
			System.out.println("are you a student");
			boolean student = s1.nextBoolean();

		}
		catch(InputMismatchException e)
		{
			System.out.println("refill the form");
			Scanner s2 = new Scanner(System.in);
			System.out.println("enter age");
			int age = s2.nextInt();
			Scanner s3 = new Scanner(System.in);
			System.out.println("enter salary");
			double salary = s3.nextDouble();
			Scanner s4 = new Scanner(System.in);

			System.out.println("enter weight");
			float weight = s4.nextFloat();
			Scanner s5 = new Scanner(System.in);

			System.out.println("are you a student");
			boolean student = s5.nextBoolean();
		}

	}
}

