package assignments;

class method1
{
	void login()
	{
		System.out.println("enter email");
	}
	
	void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
}

public class A_42_method_overiding extends method1
{
	void login()
	{
		System.out.println("enter number");
		
	}

	public static void main(String[] args) 
	{
		A_42_method_overiding a42 = new A_42_method_overiding();
		a42.login(); //call the child class method
		

	}

}
