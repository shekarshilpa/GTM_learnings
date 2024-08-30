package assignments;

public class A_17_update_global_static_nonStatic_variable
{
	static int a = 30;
	int b = 20;
	

	public static void main(String[] args)
	{
		
		System.out.println(a);
		a=40;
		System.out.println(a);
		A_17_update_global_static_nonStatic_variable a17= new A_17_update_global_static_nonStatic_variable();
		System.out.println(a17.b=100);
		

	}
}
