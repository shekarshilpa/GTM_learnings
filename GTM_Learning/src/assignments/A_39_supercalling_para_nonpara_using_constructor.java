package assignments;
class parentclass
{
	parentclass()
	{
		System.out.println("this is parent class constructor");
	}
	
}

public class A_39_supercalling_para_nonpara_using_constructor extends parentclass
{
	A_39_supercalling_para_nonpara_using_constructor()
	{
		
		System.out.println("this is child class constructor");
	}
	

	public static void main(String[] args) 
	{
		A_39_supercalling_para_nonpara_using_constructor a39 = new A_39_supercalling_para_nonpara_using_constructor();

	}

}
