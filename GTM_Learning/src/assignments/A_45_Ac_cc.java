package assignments;

abstract class class1
{
	abstract void method1();
	
	void add()
	{
		System.out.println("concrete method within abstract class");
	}
	
}

public class A_45_Ac_cc extends class1
{
	void sub()
	{
		System.out.println("concrete method in child class");
	}

	public static void main(String[] args) 
	{
		A_45_Ac_cc a45 = new A_45_Ac_cc();
		a45.sub();
		a45.add();
		a45.method1();
		

	}

	
	void method1() 
	{
		System.out.println("unimplemented method");
		
	}

}
