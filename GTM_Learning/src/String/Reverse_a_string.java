package String;

public class Reverse_a_string {

	public static void main(String[] args) 
	{
		String s = "Shilpa";
		String reverse ="";
		
		for (int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);// the return type of charAt is char
			
			reverse = reverse+ch;
			//System.out.println(reverse);

			
		}
		System.out.println(reverse);
	}

}
