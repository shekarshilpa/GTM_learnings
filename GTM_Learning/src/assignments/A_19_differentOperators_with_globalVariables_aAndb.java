package assignments;

public class A_19_differentOperators_with_globalVariables_aAndb 
{
	static int a =10;
	static int b =20;
	static int sum;
	static void add()
	{
		sum=a+b;
		System.out.println(sum);
		
	}
	static void sub()
	{
		sum=a-b;
		System.out.println(sum);
		
	}
	static void mul()
	{
		sum=a*b;
		System.out.println(sum);
		
	}
	static void div()
	{
		sum=a/b;
		System.out.println(sum);
		
	}
	static void mod()
	{
		sum=a%b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) 
	{
		add();
		sub();
		div();
		mul();
		mod();
		
	}

}
