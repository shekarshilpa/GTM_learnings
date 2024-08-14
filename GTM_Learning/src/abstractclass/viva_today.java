package abstractclass;

/*public class viva_today  
{
	void CM1() 
	{
			System.out.println(" abs1");

	}
	
	void CM2()
	{
			System.out.println(" abs2");

	}
}*/

abstract class v1
{
	abstract void CM3();
	abstract void CM4();
	
}

class vb extends v1
{
	void CM5()
	{
		System.out.println("not overridden");
	}
	
	void CM6() 
	{
		System.out.println("not overridden");

	} 

	public static void main(String[] args)
	{
	 vb b = new vb();
	 b.CM3();
	 b.CM4();
	 b.CM5();
	 b.CM6();
	 /*viva_today t = new viva_today();
	 t.CM1();
	 t.CM2();*/
	}

	@Override
	void CM3() 
	{		System.out.println(" overridden");

		// TODO Auto-generated method stub
		
	}

	@Override
	void CM4() 
	{
				System.out.println(" overridden");

		// TODO Auto-generated method stub
		
	}

}
