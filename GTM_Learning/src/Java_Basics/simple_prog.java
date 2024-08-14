package Java_Basics;

public class simple_prog 
{
	static int a =10;
	 static int b = 20;
	
	public void add(int a, int b) 
	{
		int sum = a+b;
		System.out.println(sum);
		
	}
	
	static void sub()
	{
		
		int sum = a-b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) 
	{
		simple_prog s = new simple_prog();
		s.add(s.a=6, s.b=5);
		sub();
		
		
	}

}
