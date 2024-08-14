package String;

import java.util.Arrays;

public class String_find_no_spaces_present
{
	static int count_of_spaces=0;
	public static void main(String[] args) 
	{
		String s = "my name is shilpa";
		char[] c1 = s.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<s.length();i++)
		{
			boolean b = Character.isSpaceChar(c1[i]);
			if(b==true)
			{
				count_of_spaces++;
			}
		}
		System.out.println("the number of spaces present is  " + count_of_spaces);
	}

}
