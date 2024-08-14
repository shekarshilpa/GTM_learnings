package Method_overriding;

class Method_Parent_Super
{
	void login() 
	{
		System.out.println("enter mobile number");
	}
}
public class SuperKeyword extends Method_Parent_Super
{
	void login() 
	{
		System.out.println("enter email");
		super.login();

	}
	
	public static void main(String[] args) 
	{
		SuperKeyword s1 = new SuperKeyword();
		s1.login();

	}

}




