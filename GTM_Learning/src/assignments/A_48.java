package assignments;
interface add
{
	void add1();

	void add1(int a, int b);
}


public class A_48 implements add
{

	public static void main(String[] args) 
	{
		A_48 a48 = new A_48();
		a48.add1();
		a48.add1(10, 10);
		

	}

	@Override
	public void add1(int a, int b) 
	{
		int sum=a+b;
		System.out.println(sum);
		
	}

	@Override
	public void add1() 
	{
		System.out.println("unimplemented method");
		
	}

}
