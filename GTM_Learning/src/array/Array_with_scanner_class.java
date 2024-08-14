package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_with_scanner_class {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the no of students present"); 
		int i1 = s1.nextInt();
		int rollno[] = new int[i1];
		for(int i =0;i<rollno.length;i++)
		{
			System.out.println("enter roll no for each student");

			rollno[i]=s1.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));

	}

}
