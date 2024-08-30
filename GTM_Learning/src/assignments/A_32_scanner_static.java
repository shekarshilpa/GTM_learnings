package assignments;

import java.util.Scanner;

public class A_32_scanner_static 
{
	static Scanner s1 = new Scanner(System.in);
	static int a;
	static int b;
	static int sum;
	
	static void add()
	{
		System.out.println("enter value of a");
		a= s1.nextInt();
		System.out.println("enter value of b");

		b=s1.nextInt();
		sum=a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		a= s1.nextInt();
		b=s1.nextInt();
		sum=a-b;
		System.out.println(sum);
	}
	static void mul()
	{
		a= s1.nextInt();
		b=s1.nextInt();
		sum=a*b;
		System.out.println(sum);
	}
	static void div()
	{
		a= s1.nextInt();
		b=s1.nextInt();
		sum=a/b;
		System.out.println(sum);
	}
	static void mod()
	{
		a= s1.nextInt();
		b=s1.nextInt();
		sum=a%b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
		

	}

}
