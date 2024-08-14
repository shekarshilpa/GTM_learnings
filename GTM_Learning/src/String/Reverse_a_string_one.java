package String;

public class Reverse_a_string_one {

	public static void main(String[] args) 
	{
		String name = "MY NAME IS SHILPA";
		String new_name = name.toLowerCase();
		System.out.println(new_name);
		String reverse ="";
		for (int i=new_name.length()-1;i>=0;i--)
		{
			char ch = new_name.charAt(i);
			reverse = reverse+ch;
		}
		System.out.println(reverse);
		
	}

}
