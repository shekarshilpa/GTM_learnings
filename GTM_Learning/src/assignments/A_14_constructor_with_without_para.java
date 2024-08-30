package assignments;

public class A_14_constructor_with_without_para 
{
	A_14_constructor_with_without_para(int a, int b)
	{
		int sum;
		sum=a+b;
		System.out.println(sum);
	}
	A_14_constructor_with_without_para()
	{
		System.out.println("constructor without para");
	}
	public static void main(String[] args) 
	{
		A_14_constructor_with_without_para  a14 = new A_14_constructor_with_without_para (10,20);
		new A_14_constructor_with_without_para();
		

	}

}
