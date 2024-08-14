package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_with_int_shud_accept_from_scanner 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of students");
		int a = s.nextInt();
		int rollno[]= new int[a];
		
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("enter the number of students");

			rollno[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}

}
