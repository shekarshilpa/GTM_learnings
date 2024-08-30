package assignments;

import java.util.Scanner;

public class A_60 {

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		Thread.sleep(2000);
		
	System.out.println("enter value of b");
	int b = s1.nextInt();
	int sum = a+b;
	System.out.println(sum);

	}

}
