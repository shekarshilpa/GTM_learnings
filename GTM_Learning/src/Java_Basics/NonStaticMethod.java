package Java_Basics;

public class NonStaticMethod 
{
	void add() 
	{
		System.out.println("Addition");
	}
	
	void subtract() 
	{
		System.out.println("Subtraction");
	}


	public static void main(String[] args)
	{
		NonStaticMethod ns = new NonStaticMethod();
		ns.add();
		ns.subtract();
	}

}
