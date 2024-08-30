package assignments;

import java.util.Arrays;

public class A_99 {

	public static void main(String[] args)
	{
		String s = "shilpa";
		String s1[] = s.split("l");
		System.out.println(s1[0]);
		
		String s2 = "my name is shilpa";
		String s3[] = s2.split(" ", 4);
		System.out.println(Arrays.toString(s3));
		

	}

}
