package Method_overriding;

class Method_Parent 
{
	void login() 
	{
		System.out.println("enter mobile number");
	}
}
public class MethodOverriding extends Method_Parent
{
	void login() 
	{
		
		System.out.println("enter email");
	}
	
	public static void main(String[] args) 
	{
		MethodOverriding m1 = new MethodOverriding();
		m1.login();

	}

}




