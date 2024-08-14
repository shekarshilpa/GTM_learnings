package Java_Basics;

public class Update_Static_Variable_Global 
{
	static int age=10;
	
	public static void age() 
	{
		System.out.println(age=20);// updating the static global variable
	}
	public static void main(String[] args)
	{
		age(); // calling the static method
		System.out.println(age=40); // updating the static global variable
		
	}

}
