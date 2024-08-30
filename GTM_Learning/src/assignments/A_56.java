package assignments;

import java.util.Scanner;

public class A_56 {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("choose the browser you want to launch");
		System.out.println("1 for chrome, 2 for edge, 3 for firefox, 4 for safari");
		int a = s1.nextInt();
		
		switch(a)
		{ 
			case 1: 
				System.out.println("chrome");
				break;
			case 2: 
				System.out.println("edge");
				break;
			case 3: 
				System.out.println("firefox");
				break;
			case 4: 
				System.out.println("safari");
				break;
				default:
					System.out.println("rerun if the input is wrong");
				
		
		}

	}

}
