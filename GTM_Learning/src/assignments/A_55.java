package assignments;

import java.util.Scanner;

public class A_55
{
	static Scanner s1 = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("enter the value of a");
		int a = s1.nextInt();
		System.out.println("enter the value of a");

		int b = s1.nextInt();
		int sum;
		
		
		switch(2)
		{
		case 1: 
			sum=a+b;
			System.out.println(sum);
		case 2: 
			sum=a-b;
			System.out.println(sum);
		case 3: 
			sum=a*b;
			System.out.println(sum);
		case 4: 
			sum=a/b;
			System.out.println(sum);
			
			default:
				System.out.println("assigment");
		
		}
		
		
	}
}
