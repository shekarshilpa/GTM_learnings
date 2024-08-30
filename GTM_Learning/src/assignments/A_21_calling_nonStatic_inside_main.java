package assignments;

public class A_21_calling_nonStatic_inside_main 
{
	public void nonstaticmethod()
	{
		int a = 13;
		int b = 40;
		int sum= a+b;
		System.out.println(sum);
	}

	public static void main(String[] args)
	{
		A_21_calling_nonStatic_inside_main a21= new A_21_calling_nonStatic_inside_main();
		a21.nonstaticmethod();
	}

}
