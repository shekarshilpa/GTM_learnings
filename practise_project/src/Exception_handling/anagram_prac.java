package Exception_handling;

import java.util.Arrays;

public class anagram_prac {

	public static void main(String[] args) 
	{
		String s1 = "elbow";
		String s2="below";
		if(s1.length()!=s2.length())
		{
			System.out.println("its not anagram");
		}
		else
		{
			System.out.println("if its anagram");
			
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean ans = Arrays.equals(c1, c2);
			if(ans==true)
			{
				System.out.println(s1   +   " is anagram of "  + s2);
			}
			else
			{
				System.out.println("its not");
			}
		}

	}

}
