package assignments;

import java.util.Arrays;

public class A_79 {

	public static void main(String[] args) 
	{
		int rollno[] = new int[4];
		rollno[0]=12;
		rollno[1]=13;
		rollno[2]=15;
		rollno[3]=16;
		int copied[] = new int[rollno.length];
		
		for(int i=0;i<rollno.length;i++)
		{
			copied[i]=rollno[i];
		}
		System.out.println("Source Array:");
		for (int value : rollno) 
		{
		    System.out.print(value + " ");
		}
		System.out.println();

		System.out.println("Destination Array:");
		for (int value : copied) 
		{
		    System.out.print(value + " ");
		}
		
		boolean ans = Arrays.equals(rollno, copied);
		if(ans==true)
		{
			System.out.println("the arrays are equal");
		}
		else
		{
			System.out.println("its not equal");
		}
	}
	

}
