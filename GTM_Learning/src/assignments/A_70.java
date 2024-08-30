package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class A_70 {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of arrays");
		int array = s1.nextInt();
		 int data[]=new int[array];
		 for(int i =0;i<data.length;i++)
			{
				System.out.println("enter arrays no for each ");

				data[i]=s1.nextInt();
			}
			
			System.out.println(Arrays.toString(data));

		}
		
	

	}

