package Exception_handling;

public class This_viva 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	public static void main(String[] args) 
	{
		This_viva v1 = new This_viva();
		v1.student_details(12, "abs", 12.78);
		System.out.println(v1.age);
		
		
		

	}

}
