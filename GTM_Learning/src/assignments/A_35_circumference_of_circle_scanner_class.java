package assignments;

import java.util.Scanner;

public class A_35_circumference_of_circle_scanner_class 
{
	static double value_of_pi=Math.PI;
	

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of r");
		int r = s1.nextInt();
		double circumference = 2*value_of_pi*r;
		System.out.println(circumference);
		
		
		//c=2pi*r
	}

}
