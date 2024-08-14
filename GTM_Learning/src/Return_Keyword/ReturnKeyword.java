package Return_Keyword;

public class ReturnKeyword 
{
	static int add(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	static double add(double a, int b)
	{
		double sum= a+b;
		return sum;
	}

	public static void main(String[] args) 
	{
		System.out.println(add(10,20));
		System.out.println(add(10.89, 90));
	}

}
