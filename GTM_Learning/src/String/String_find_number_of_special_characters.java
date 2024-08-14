package String;

import java.util.Arrays;

public class String_find_number_of_special_characters
{
	static int count_of_characters=0;
	public static void main(String[] args) 
	{
		String s = "shilpa@#$%";
		char[] c1 = s.toCharArray();
		int s1 = s.length();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<s.length();i++)
		{
			boolean b = !Character.isLetterOrDigit(c1[i]);
			if (b==true)
			{
				count_of_characters++;
			}
		}
		System.out.println("the number of special characters present" + count_of_characters);
	}

}
