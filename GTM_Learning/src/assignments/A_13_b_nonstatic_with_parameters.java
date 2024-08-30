package assignments;

public class A_13_b_nonstatic_with_parameters
{
	void add(int a, int b)
	{
		int sum;
		sum=a+b;
		System.out.println(sum);
	}
	void sub(int a, int b)
	{
		int sum;
		sum=a-b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		A_13_b_nonstatic_with_parameters a13= new A_13_b_nonstatic_with_parameters();
		a13.add(10, 20);
		a13.sub(20, 10);

	}

}
