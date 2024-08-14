package Java_Basics;

public class Exam_One
{
	static void add() 
	{
		System.out.println("add");
	}
	
	void sub() 
	{
		System.out.println("sub");
	}
	
	Exam_One()
	{
		System.out.println("constructor");
	}

	public static void main(String[] args) 
	{
		add();
		Exam_One e = new Exam_One();
		e.sub();
		
	}

}
