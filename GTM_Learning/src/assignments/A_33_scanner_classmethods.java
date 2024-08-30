package assignments;

import java.util.Scanner;

public class A_33_scanner_classmethods {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter mismatch value for each datatype to see the input mismatch exception");
		//int age = s1.nextInt();
		//String s = s1.next(); // for next() we will not get any exception as we can store anything in ""
		Byte b = s1.nextByte();
		//Short s2 = s1.nextShort();
		//Long l1 = s1.nextLong();
		//Float f = s1.nextFloat();
		//Double d = s1.nextDouble();
		//Boolean b1 = s1.nextBoolean();

	}

}
