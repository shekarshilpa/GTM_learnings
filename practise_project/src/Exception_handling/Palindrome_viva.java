package Exception_handling;

public class Palindrome_viva
{
public static void main(String[] args)
{
	String s= "malayalam";
	String s1 = s.toLowerCase();
	String reverse="";
	
	for(int i=s1.length()-1;i>=0;i--)
	{
		char ch = s1.charAt(i);
		reverse = reverse+ch;
	}
	System.out.println(reverse);
	
	boolean ans = s1.equals(reverse);
	System.out.println(ans);
	if(ans==true)
	{
		System.out.println(" is palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
