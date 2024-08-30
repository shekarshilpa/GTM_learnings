package assignments;

public class A_41_thiscalling_para_nonpara 
{
	A_41_thiscalling_para_nonpara(int a) 
	 	{
		 	System.out.println("1");
	 	}
	A_41_thiscalling_para_nonpara(int a, int b) 
		{
		 	this(100);
		 	//int sum = a+b;
		 	System.out.println("2");

		}
	A_41_thiscalling_para_nonpara(int a, double b) 
		{
		 	this(10, 20); //calling the constructor within the same class with matching arguments
		 	System.out.println("3");

		}
	A_41_thiscalling_para_nonpara() 
		{
		 	System.out.println("4");

		}

	public static void main(String[] args) 
	{
		A_41_thiscalling_para_nonpara a41 = new A_41_thiscalling_para_nonpara();
	new A_41_thiscalling_para_nonpara(10);
	 new A_41_thiscalling_para_nonpara(13,13);
		new A_41_thiscalling_para_nonpara(13,14.90);

	}

}
