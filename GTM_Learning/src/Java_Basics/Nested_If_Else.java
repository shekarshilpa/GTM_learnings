package Java_Basics;

public class Nested_If_Else
{

	public static void main(String[] args) 
	{
		int a = 10;
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
		}
	}

