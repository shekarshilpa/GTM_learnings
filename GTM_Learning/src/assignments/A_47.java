package assignments;
interface inter1
{
	void absmethod1();
	void absmethod2();
}

abstract class absclass implements inter1
{
	abstract void absmethod3();
	abstract void absmethod4();
	
	void add1()
	{
		System.out.println("cm1");
	}
	void add2()
	{
		System.out.println("cm2");
	}
}


public class A_47 extends absclass
{
	void add3()
	{
		System.out.println("cm3");
	}
	void add4()
	{
		System.out.println("cm4");
	}

	public static void main(String[] args) 
	{
		A_47 a47 = new A_47();
		a47.absmethod1();
		a47.absmethod2();
		a47.absmethod3();
		a47.absmethod4();
		a47.add1();
		a47.add2();
		a47.add3();
		a47.add4();
		

	}
	@Override
	public void absmethod1() 
	{
		System.out.println("abs1");
		
	}
	@Override
	public void absmethod2() 
	{
		System.out.println("abs2");

	}
	@Override
	void absmethod3()
	{
		System.out.println("abs3");

	}
	@Override
	void absmethod4() 
	{
		System.out.println("abs4");

	}

}
