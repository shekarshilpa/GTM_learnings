package array;

import java.util.Arrays;

public class Array_check_if_two_arrays_are_equal {

	public static void main(String[] args) 
	{
			String a = "shilpa";
			char[] b = a.toCharArray();
			String a1 = "shilpa";
			char[] b1 = a.toCharArray();

			boolean ans = Arrays.equals(b,b1);
			System.out.println(ans);
			
	}

}
