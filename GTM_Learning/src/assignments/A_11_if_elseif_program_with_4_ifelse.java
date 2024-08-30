package assignments;

public class A_11_if_elseif_program_with_4_ifelse {

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		if(a>b)
		{
			System.out.println("just the if block");
		}
		
		else if(a<b)
		{
			System.out.println("the 1st if else");
		}
		else if(a==b)
		{
			System.out.println("the 2nd if else");
		}
		else if(a>c)
		{
			System.out.println("the 3rd if else");

		}
		else if(a<c)
		{
			System.out.println("the 4th if else");

		}
		
		
		else
		{
			System.out.println("the else of 1st if");
		}


	}

}
