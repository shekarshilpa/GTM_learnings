package Exception_handling;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter year");
		int year = s1.nextInt();
		
		if(year%4==0)
		{
			System.out.println("its leap" +year);
		}
		else
		{
			System.out.println("its not leap" +year);
		}
	}

}
