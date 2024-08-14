package Exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multiple_catch {

	public static void main(String[] args) 
	{
		int rollno[] = new int[3];
		rollno[0]= 15;
		rollno[1]= 19;
		rollno[2]= 30;
		try 
		{
			rollno[3] = 40;
			//Scanner s1 = new Scanner(System.in);
			//System.out.println("enter number");
			//int num = s1.nextInt();
		}
		catch(ArrayIndexOutOfBoundsException a1) 
		{
			System.out.println("array exception handled");
		}
		catch(NullPointerException a2) 
		{
			System.out.println("nullpointer exception handled");
		}
		catch(InputMismatchException a3) 
		{
			System.out.println("input mismatch exception handled");
		}
		}


		
		
	}


