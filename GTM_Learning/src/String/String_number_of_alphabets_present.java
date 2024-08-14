package String;

import java.util.Arrays;

public class String_number_of_alphabets_present
{
	static int count_of_alphabet=0;

	public static void main(String[] args)
	{
		String s = "50cent";
		char[] c1 = s.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<s.length();i++)
		{
			boolean b =Character.isLetter(c1[i]);
			if(b==true)
			{
				count_of_alphabet++;
			}
		}
		System.out.println("the number of alphabet presnet is " +  count_of_alphabet);
	}

}
