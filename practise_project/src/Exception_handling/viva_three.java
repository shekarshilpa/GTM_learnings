package Exception_handling;

import java.util.Arrays;

public class viva_three {
	
	//find out if both the arrays are equal without using any predefined equals function

	public static void main(String[] args) 
	{
		int number[]= new int[3];
		number[0]=12;
		number[1]=56;
		number[2]=67;
		
		int number1[]= new int[3];
		number1[0]=12;
		number1[1]=56;
		number1[2]=67;
		boolean result =true;
		
	if(number.length==number1.length)
	{
		for(int i=0;i<number.length;i++)
		{
			if(number[i]!=number1[i])
			{
				result=false;
			
			}
		}
	}
	
			else
			{
				result = false;
			}
			if(result==true)
			{
				System.out.println("equal");
			}
			else
			{
				System.out.println("not equal");

		
	}

}
}
