package Exception_handling;

public class viva_today1 
{
	static int count_of_digits=0;
	//number of digits and letters in the given string
	public static void main(String[] args)
	{
		String s1 = "shilpa486";
		char[] s2 = s1.toCharArray();
		System.out.println(s2);
		for(int i=0;i<s1.length();i++)
		{
			boolean ans = Character.isDigit(s2[i]);
			if(ans==true)
			{
				count_of_digits++;
			}
			
			//System.out.println("the number of digits" + count_of_digits);
		}
		System.out.println("the number of digits" + count_of_digits);

	}

}
