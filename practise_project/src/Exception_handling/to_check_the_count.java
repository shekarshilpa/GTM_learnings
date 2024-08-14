package Exception_handling;

public class to_check_the_count 
{
	static int count_of_alpha=0;
	public static void main(String[] args) 
	{
		String s ="hello123 ###";
		char[] c1 = s.toCharArray();
		System.out.println(c1);
		for(int i=0;i<s.length();i++)
		{
			boolean b1 =Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				count_of_alpha++;
			}
		}
		System.out.println(count_of_alpha);
	}

}
