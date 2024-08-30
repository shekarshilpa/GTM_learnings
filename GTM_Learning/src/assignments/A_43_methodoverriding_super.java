package assignments;
class method2
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
public class A_43_methodoverriding_super extends method2
{
	void login()
	{
		System.out.println("enter number");
		super.add(12, 10);
		super.login();
	}

	public static void main(String[] args) 
	{
		A_43_methodoverriding_super a43 = new A_43_methodoverriding_super();
		a43.login();
		

	}

}
