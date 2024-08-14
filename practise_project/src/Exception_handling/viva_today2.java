package Exception_handling;

public class viva_today2 
{
	static int count_of_letter=0;
	static int count_of_digit=0;

	public static void main(String[] args) 
	{
		String s1 = "shilpa486";
		char[] s2 = s1.toCharArray();
		System.out.println(s2);
		for(int i=0;i<s1.length();i++)
		{
			boolean ans = Character.isAlphabetic(s2[i]);
			boolean ans1= Character.isDigit(s2[i]);
			if(ans==true)
			{
				count_of_letter++;
				
			}
			
			//System.out.println("the number of digits" + count_of_letter);
		if(ans1==true)
	{
		count_of_digit++;
		
	}
		}
		System.out.println("the number of letters" + count_of_letter);
		System.out.println("the number of digits" + count_of_digit);


}
	}
