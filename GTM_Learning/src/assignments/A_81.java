package assignments;

import java.util.Arrays;

public class A_81 
{
	static int k =0;
	public static void main(String[] args) 
	{
		int rollno[]= {12,43,45,67};
		int reverse_rollno[]= new int[rollno.length];
		for(int i=rollno.length-1;i>=0;i--)
		{
			reverse_rollno[i]=rollno[k];
			k++;
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(reverse_rollno));
	}

}
