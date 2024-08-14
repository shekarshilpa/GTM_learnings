package ThisKeyword;

public class ThisKeywordJava 
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
		ThisKeywordJava j1 = new ThisKeywordJava();
		j1.student_details(25, "fdshf", 56.878);
		System.out.println(j1.age);
		System.out.println(j1.name);
		System.out.println(j1.salary);
		
	}

}
