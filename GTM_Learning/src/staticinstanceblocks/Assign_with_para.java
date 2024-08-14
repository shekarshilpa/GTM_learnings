package staticinstanceblocks;

public class Assign_with_para 
{
	static
	{
		System.out.println("SIB");
	}
	
	public Assign_with_para()
	{
		System.out.println("constructor");
	}
	public Assign_with_para(int a )
	{
		System.out.println("constructor with para");
	}	
	{
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		Assign_with_para ap = new Assign_with_para();
		Assign_with_para ap1 = new Assign_with_para(10);

		

	}

}
