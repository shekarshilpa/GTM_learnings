package String;

public class String_Palindrome {

	public static void main(String[] args) 
	{
		String s1 = "Rotator";
		String s2 = s1.toLowerCase();//rotator
		String reverse = "";
		for (int i =s2.length()-1;i>=0;i--)
		{
			char ch = s2.charAt(i);
			reverse = reverse+ch;
		}
		System.out.println(reverse);
		boolean result = s2.equals(reverse);
		System.out.println(result);
		if(result==true)
		{
			System.out.println(s2 + " " + reverse + " is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
