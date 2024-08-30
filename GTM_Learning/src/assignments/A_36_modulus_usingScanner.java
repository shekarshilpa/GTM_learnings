package assignments;

import java.util.Scanner;

public class A_36_modulus_usingScanner 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the dividend");
		int n1= s1.nextInt();
		System.out.println("enter the divisor");
		int n2= s1.nextInt();
		if(n2!=0)
		{
            int remainder = n1 % n2;
            System.out.println("The remainder of " + n1 + " divided by " + n2 + " is: " + remainder);

		}
		else
		{
			
			System.out.println("it cannot be zero");
		}

		
	}

}
