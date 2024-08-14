package String;

import java.util.Arrays;

public class String_Functions 
{
	static int count_of_digit;
	//static int count_of_special_characters;
	public static void main(String[] args) 
	{
		String s1 = "my name is shilpa";
		boolean answer = s1.contains("my");
		System.out.println(answer);
		boolean answer1 = s1.endsWith("pa");
		System.out.println(answer1);
		char name[] =s1.toCharArray();
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		System.out.println(name[5]);
		String s2 = "50cent";
		char s2_array[]=s2.toCharArray();
		System.out.println(Arrays.toString(s2_array));
		for(int i=0;i<s2.length();i++) 
		{
		boolean b1 = Character.isDigit(s2_array[i]);
		System.out.println(b1);
		
		if(b1==true)
		{
			count_of_digit++;
		}
		}
		System.out.println("the no of digits present" +count_of_digit);
		
		
		
	}

}
