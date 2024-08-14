package abstractclass;

public class Assignment_abstract_class 
{
		void CM1() 
		{
			
		}
		
		void CM2()
		{
			
		}
	}
	
	abstract class Demo2 
	{
		abstract void CM3();
		abstract void CM4();
		
		void abs1() 
		{
			
		}
		
		void abs2() 
		{
			
		}
	}
	
	 class Demo3 extends Demo2
	{
		void CM5()
		{
			
		}
		
		void CM6() 
		{
			
		}
	public static void main(String[] args) 
	{
		Assignment_abstract_class  aa = new Assignment_abstract_class();
		aa.CM1();
		aa.CM2();
		Demo3 d3 = new Demo3();
		d3.CM3();
		d3.CM4();
		d3.CM5();
		d3.CM6();

	}

	void CM3() 
	{
		
	}

	
	void CM4() 
	{
		
	}

}

