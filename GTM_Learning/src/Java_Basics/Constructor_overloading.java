package Java_Basics;

public class Constructor_overloading
{
	Constructor_overloading(int a)
	{
		System.out.println(10);
	}
	Constructor_overloading(boolean b)
	{
		System.out.println(true);

	}
	Constructor_overloading(char c)
	{
		System.out.println('a');

	}
	Constructor_overloading(String a)
	{
		System.out.println("gtm");

	}
	public static void main(String[] args)
	{
		Constructor_overloading c1 = new Constructor_overloading(12);
		Constructor_overloading c2 = new Constructor_overloading(false);
		Constructor_overloading c3 = new Constructor_overloading('z');
		Constructor_overloading c4 = new Constructor_overloading("automation");
		


		    
	}

}
