package assignments;
class parenta1
{
	void add()
	{
		System.out.println("parent1 class");
	}
}

class parenta2 extends parenta1
{
	void sub()
	{
		System.out.println("parent2 class");
	}
	
}

public class A_38a_multilevel_nonstatic extends parenta2
{
	void mul()
	{
		System.out.println("mul in child class");
	}
	

	public static void main(String[] args) 
	{
		A_38a_multilevel_nonstatic a38= new A_38a_multilevel_nonstatic();
		a38.add();
		a38.sub();
		a38.mul();
	}

}
