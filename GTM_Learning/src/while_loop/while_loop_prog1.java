package while_loop;

public class while_loop_prog1 {

	public static void main(String[] args)
	{
		int i=0;
		//while(i>12) - 0 is not greater than 12 so the code will run but there wont be output
		/*int i=10; - this will give infinite output coz everytime the value of i keeps getting incremented and it becomes greater than 8
		while(i>8)*/
		while(i<12) 
		{
			System.out.println("my name");
			i++;
		}
	}

}
