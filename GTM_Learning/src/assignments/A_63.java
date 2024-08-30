package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_63 {

	public static void main(String[] args)
	{
		int rollno[]= new int[4];
		rollno[0]=12;
		rollno[1]=13;
		rollno[2]=14;
		rollno[3]=15;
		
		try 
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("enter integer value");
					s1.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("array size exceeded");
		}
		catch(NullPointerException n)
		{
			System.out.println("null");
		}
		catch(InputMismatchException i)
		{
			System.out.println("input");
		}
	}

}
