package assignments;

public class A_13_a_static_with_parameters 
{
	static void add(int a, int b)
	{
		int sum;
		sum=a+b;
		System.out.println(sum);
	}
	static void sub(int a, int b)
	{
		int sum;
		sum=a-b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		add(10, 20);
		sub(20,10);

	}

}
