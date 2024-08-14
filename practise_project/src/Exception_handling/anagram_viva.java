package Exception_handling;

import java.util.Arrays;

public class anagram_viva {

	public static void main(String[] args) 
	{
		String s1 = "chinfggh";
		String s2 = "inch";
		
	if(s1.length()!=s2.length())
	{
		System.out.println("its not anagram");
	}
	else
	{
		System.out.println("to check if its anagram");
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		System.out.println(c2);
		
		boolean ans = Arrays.equals(c1, c2);
		if(ans==true)
		{
			System.out.println("its anagram");
		}
		else
		{
			System.out.println("its not");
		}
	}
				
	

}
}
