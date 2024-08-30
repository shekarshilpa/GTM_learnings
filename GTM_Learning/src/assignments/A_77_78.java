package assignments;

public class A_77_78 
{
	static int no_to_check=15;
	public static void main(String[] args) 
	{
		int no[] = {12, 13, 14, 15, 16};
		
		for(int i=0;i<no.length;i++)
		{
			if(no_to_check==no[i])
			{
				System.out.println("15 is present" + "the index is" +i);
			}
			else
			{
				System.out.println("its not");
			}
		}
	}

}
