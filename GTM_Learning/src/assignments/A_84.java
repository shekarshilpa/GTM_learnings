package assignments;

public class A_84 {

	public static void main(String[] args)
	{
		String s = "my name is shilpa";
		String s2 = s.replaceAll("\\s+", "");// '\\s+' is a regular expression that matches one or more whitespace characters.
		System.out.println(s2);

	}

}
