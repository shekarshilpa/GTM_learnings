package assignments;
class parent_class_one  
{
	static void sub()
	{
	int a = 40;
	int b = 10;
	int sum=a-b;
	System.out.println(sum);
	}

}
public class A_37_single_inheritance_static_methods extends parent_class_one
{
	static void add()
	{
		int a = 10;
		int b = 20;
		int sum=a+b;
		System.out.println(sum);
	}

	
	

	public static void main(String[] args) 
	{
		add();
		sub();               
		
	}

}


