package Method_overriding;

class bike
{
	void start()
	{
		System.out.println("self start");
	}
}

public class Create_object_of_parent_class extends bike
{
	void start()
	{
		super.start();
		System.out.println("manual start");
	}

	public static void main(String[] args) 
	{
		bike b1 = new bike(); //creating object of parent class
		b1.start(); //parent class method will be invoked
		//Create_object_of_parent_class c1 = new Create_object_of_parent_class();
		//c1.start();
	}

}
