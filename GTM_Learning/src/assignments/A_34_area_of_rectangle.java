package assignments;

import java.util.Scanner;

public class A_34_area_of_rectangle 
{
	
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of l");
		int l = s1.nextInt();
		System.out.println("enter the value of b");
		int b = s1.nextInt();
		int area_of_rectangle = l*b;
		System.out.println(area_of_rectangle);

	}

}
