package Exception_handling;
 class encap_viva_new
{
	private int age = 18;
	//private double salary = 45.89;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public class encap_viva
	{
		public static void main(String[] args) 
		{
			encap_viva_new b1 = new encap_viva_new();
			b1.setAge(23);
			System.out.println(b1.getAge());
		}
	}
	
	

}
