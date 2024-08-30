package assignments;
class parent1
{
	static void add()
	{
		System.out.println("parent1 class");
	}
}

class parent2 extends parent1
{
	static void sub()
	{
		System.out.println("parent2 class");
	}
	
}

public class A_38_multilevel_inheritance_static extends parent2
{
	static void mul()
	{
		System.out.println("mul method in child class");
	}

	public static void main(String[] args) 
	{
		mul(); //executes 1st
		sub(); //executes 2nd
		add(); //executes 3rd
				
		
		

	}

}
