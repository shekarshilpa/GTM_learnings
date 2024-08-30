package assignments;

public class A_51 //note: within the class all specifiers can be accessed
{
	public void add()
	{
		System.out.println("public access specifier");
	}
	private void sub()
	{
		System.out.println("private access specifier");

	}
	protected void mul() 
	{
		System.out.println("protected access specifier");

	}
	
	void div()
	{
		System.out.println("default/package access specifier");

	}

	public static void main(String[] args) 
	{
		A_51 a51 = new A_51();
		a51.add();
		a51.div();
		a51.mul();
		a51.sub();
		
	}

}
