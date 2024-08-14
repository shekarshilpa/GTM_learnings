package interface_new;

abstract class Grand_parent
{
	abstract void add();
}

 abstract class Parent_class extends Grand_parent // class can be abstract without having any abstract methods in it
{
	void sub()
	{
		
	}
	
}

public class Zero_abstraction extends Parent_class
{
	
	void add() // since the parent class is extending grand parent the abstract method in grand parent should be overridden in child and make the parent class abstract
	{
		
	}
	
	void multiply() 
	{
		
	}

	public static void main(String[] args) 
	{

	}

	

}
