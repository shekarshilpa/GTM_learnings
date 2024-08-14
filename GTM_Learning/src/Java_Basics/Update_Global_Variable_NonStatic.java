package Java_Basics;

public class Update_Global_Variable_NonStatic 
{
	int a=10;
	
	public static void add() 
	{
		Update_Global_Variable_NonStatic ug = new  Update_Global_Variable_NonStatic();
		System.out.println(ug.a=20);
	}

	public static void main(String[] args) 
	{
		 Update_Global_Variable_NonStatic ug= new  Update_Global_Variable_NonStatic();
		 System.out.println(ug.a=40);
		 add();
	}

}
