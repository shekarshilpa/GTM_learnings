package String;

import java.util.Arrays;

public class String_toCharArray 
{
		static int count_of_digit=0;
	public static void main(String[] args) 
	{
		String s = "shilpa";
		char[] c1 = s.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		String s1 = "50cent";
		char[] c2 = s1.toCharArray();
		System.out.println(Arrays.toString(c2));
		//System.out.println(c2[2]);
		//find out how many numeric are present in the string "50cent"
		for(int i=0;i<s1.length();i++)
		{
		boolean b = Character.isDigit(c2[i]);
		
		if(b==true)
		{
			count_of_digit++;
		}
		}
		System.out.println("the number of digits in the given string " + s1 + " is " + count_of_digit);
	}

}
