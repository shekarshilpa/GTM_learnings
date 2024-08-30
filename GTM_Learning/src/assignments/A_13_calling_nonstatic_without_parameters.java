package assignments;

public class A_13_calling_nonstatic_without_parameters 
{
	int a = 10;
	int b = 20;
	int sum;
	void add()
	{
		sum=a+b;
		System.out.println(sum);
	}
	void sub()
	{
		sum=a-b;
		System.out.println(sum);

	}

	public static void main(String[] args)
	{
		A_13_calling_nonstatic_without_parameters a13 = new A_13_calling_nonstatic_without_parameters();
		a13.add();
		a13.sub();

	}

}
