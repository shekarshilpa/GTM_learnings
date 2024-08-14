package String;

public class practice {

	public static void main(String[] args) 
	{
		String a1 = "mynameisshilpa";
		String a2 = a1.toLowerCase();
		String reverse = "";
		System.out.println(a2);
		
		for(int i=a2.length()-1;i>=0;i--)
		{
			char ch = a2.charAt(i);
			reverse = reverse+ch;
		}
	System.out.println(reverse);
		
	
	}
}


