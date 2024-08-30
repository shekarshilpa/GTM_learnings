package assignments;

public class A_12_calling_static_without_parameters 
{
	static int a = 10;
	static int b = 20;
	static int sum;
		static void add() 
		{
			sum=a+b;
			System.out.println("Addition");
			System.out.println(sum);
			
		}
		
		static void subtract() 
		{
			sum=a-b;
			System.out.println("Subtraction");
			System.out.println(sum);

		}

		public static void main(String[] args) 
		{
			add();
			subtract();
			
		}
	

}
