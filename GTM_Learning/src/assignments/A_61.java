package assignments;

public class A_61 {

	public static void main(String[] args) 
	{
		try
		{
			int sum = 1/0;
			System.out.println(sum);
		}
		catch(ArithmeticException e)
		{
			int sum=1/1;
			System.out.println(sum);
		}

	}

}
