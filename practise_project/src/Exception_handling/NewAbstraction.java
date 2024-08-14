package Exception_handling;

abstract class newone
{
	abstract void n1();
	abstract void n2();
	abstract void n3();
	
	public void Cm1()
	{
		System.out.println("75% abstraction");
	}
}

public class NewAbstraction extends newone
{
	public void n1()
	{
		System.out.println("un1");
	}
	
	public void n2()
	{
		System.out.println("un2");

	}
	public void n3()
	{
		System.out.println("un3");

	}	
	

	public static void main(String[] args) 
	{
		NewAbstraction nc = new NewAbstraction();
		nc.n1();
		nc.n2();
		nc.n3();
		nc.Cm1();
	}

}
