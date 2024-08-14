package abstractclass;

public class testinghfghf {

	public static void main(String[] args)
	{
		try
		{
			int[] numbers = {1,2,3};
			System.out.println("Ele at index 3: " + numbers[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("error");
		}
	}

}
