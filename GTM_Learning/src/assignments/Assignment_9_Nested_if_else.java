package assignments;

public class Assignment_9_Nested_if_else {

	public static void main(String[] args) 
	{
		int a = 40;
		int b = 20;
		int c = 30;
		if(a<b)
		{
			if(b<c) 
			{
				if (c>a) 
				{
					System.out.println("c is 30");
				}
				else
				{
					System.out.println("else of 3rd if");

				}
			}
				else
				{
					System.out.println("else of 2nd if");
				}
			}
		else
		{
			System.out.println("else of 1st if");
		}
	}

}
