package Encapsulation;

public class Encapsulationjava 
{
	private int age=18;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	private String email = "shilpa@io.in";
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public static void main(String[] args) 
	{
		Encapsulationjava ej = new Encapsulationjava();
		ej.setAge(29);
		System.out.println(ej.getAge());
		ej.setEmail("sri@o.in");
		System.out.println(ej.getEmail());
	}

}
