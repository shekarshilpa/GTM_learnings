package assignments;

public class A_52a 
{
	public void add()
	{
		System.out.println("public access specifier trying to access within the package by creating an object of this class in another class");
	}
	private void sub()
	{
		System.out.println("private access specifier trying to access within the package by creating an object of this class in another class");

	}
	protected void mul() 
	{
		System.out.println("protected access specifier trying to access within the package by creating an object of this class in another class");

	}
	
	void div()
	{
		System.out.println("default/package access specifier trying to access within the package by creating an object of this class in another class");

	}

	public static void main(String[] args)
	{
		

	}

}
