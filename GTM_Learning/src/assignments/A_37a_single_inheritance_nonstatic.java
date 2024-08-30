package assignments;
class parent_class
{
	void sub()
	{
		int a = 20;
		int b = 10;
		int sum=a-b;
		System.out.println(sum);
	}
	
}

public class A_37a_single_inheritance_nonstatic extends parent_class //child class extends the parent class
{
	 void add()
	{
		int a = 10;
		int b = 20;
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) 
	{
		A_37a_single_inheritance_nonstatic a1 = new A_37a_single_inheritance_nonstatic();
		a1.add();
		a1.sub();
		

	}



}
