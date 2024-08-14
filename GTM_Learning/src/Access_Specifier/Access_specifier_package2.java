package Access_Specifier;

public class Access_specifier_package2 
{
	public static void main(String[] args) 
	{
		Access_Specifier_package1 a1 = new Access_Specifier_package1();
		a1.add();
		a1.sub();
		a1.div();
		//a1.mul(); this cannot be accessed as the access specifier is private 
		

	}
	
}
