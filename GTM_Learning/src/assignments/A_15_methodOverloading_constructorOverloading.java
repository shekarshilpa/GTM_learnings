package assignments;

public class A_15_methodOverloading_constructorOverloading 
{
	static int a = 10;
	static int b = 20;
	static int sum;
	static void add()
	{
		sum=a+b;
		System.out.println(sum);
	}
	
	static void add(int a, int b) 
	{
		sum=a+b;
		System.out.println(sum);
	}
	A_15_methodOverloading_constructorOverloading()
	{
		System.out.println("constructor without para");
	}
	A_15_methodOverloading_constructorOverloading(int a, int b)
	{
		System.out.println("constructor with para");
		sum=a+b;
		System.out.println(sum);
	}
	A_15_methodOverloading_constructorOverloading(boolean b)
	{
		boolean ans = true;
		System.out.println(ans);
	}
	

	public static void main(String[] args) 
	{
		add();
		add(60,40);
		new A_15_methodOverloading_constructorOverloading();
		new A_15_methodOverloading_constructorOverloading(false);
		new A_15_methodOverloading_constructorOverloading(30, 40);
	}

}
