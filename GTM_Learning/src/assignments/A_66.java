package assignments;

public class A_66 {

	public static void main(String[] args) 
	{
		String s = "my name is shilpa";
		char index = s.charAt(4);
		System.out.println(index);
		
		int charindex= s.indexOf('s');
		System.out.println(charindex);
		
		
		String s1 = "      shilpa     ";
		String s2 = s1.trim();
		System.out.println(s2);
		
		String substring = s.substring(3);
		System.out.println(substring);
		
		String substring_two=s.substring(3, 10);
		System.out.println(substring_two);


	}

}
