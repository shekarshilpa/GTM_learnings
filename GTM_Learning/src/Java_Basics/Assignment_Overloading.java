package Java_Basics;

public class Assignment_Overloading
{
	public Assignment_Overloading(int a) 
	{
		System.out.println("calling constructor");
	}
	public Assignment_Overloading(String name) 
	{
		System.out.println("Automation");
	}
	
	public static void add(int a, int b) 
	{
		int sum = a+b;
		System.out.println(sum);		
	}
	public void add(int a, int b, int c)
	{
		int sum=a+b+c;
		System.out.println(sum);		

	}
	public static void main(String[] args) 
	{
		Assignment_Overloading a1 = new Assignment_Overloading(10);
		new Assignment_Overloading("shilpa");
		add(10,20);
		a1.add(10,20,30);
	}

}
