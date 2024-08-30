package assignments;

import java.util.Scanner;

public class A_32a_scanner_nonstatic 
{
	public void add()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter value of a");
		int a= s1.nextInt();
		System.out.println("enter value of b");

		int b=s1.nextInt();
		int sum=a+b;
		System.out.println(sum);
	}
	public void sub()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter value of a");
		int a= s1.nextInt();
		System.out.println("enter value of b");

		int b=s1.nextInt();
		int sum=a-b;
		System.out.println(sum);
	}
	public void mul()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter value of a");
		int a= s1.nextInt();
		System.out.println("enter value of b");

		int b=s1.nextInt();
		int sum=a*b;
		System.out.println(sum);
	}
	public void div()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter value of a");
		int a= s1.nextInt();
		System.out.println("enter value of b");

		int b=s1.nextInt();
		int sum=a/b;
		System.out.println(sum);
	}
	public void mod()
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter value of a");
		int a= s1.nextInt();
		System.out.println("enter value of b");

		int b=s1.nextInt();
		int sum=a%b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		A_32a_scanner_nonstatic a32= new A_32a_scanner_nonstatic();
		a32.add();
		a32.mul();
		a32.div();
		a32.mod();
		

	}

	

}
