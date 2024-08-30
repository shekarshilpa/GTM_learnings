package assignments;
class CM
{
	void CM1()
	{
		System.out.println("cm1");
	}
	void CM2()
	{
		System.out.println("cm2");
	}
}

abstract class classnew extends CM
{
	abstract void AM1();
	abstract void AM2();
	
	void CM3()
	{
		System.out.println("cm3");
	}
	
	void CM4()
	{
		System.out.println("cm4");
	}
}

public class A_46 extends classnew
{
	void CM5()
	{
		System.out.println("cm5");
	}
	
	void CM6()
	{
		System.out.println("cm6");
	}

	public static void main(String[] args) 
	{
		A_46 a46 = new A_46();
		a46.AM1();
		a46.AM2();
		a46.CM3();
		a46.CM4();
		a46.CM5();
		a46.CM6();
		a46.CM1();
		a46.CM2();
		

	}

	@Override
	void AM1() 
	{
		System.out.println("uminplemented am1");
		
	}

	@Override
	void AM2()
	{
		System.out.println("uminplemented am2");

		
	}

}
