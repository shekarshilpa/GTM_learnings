package assignments;

public class A_18_area_of_circle_using_globalVariable 
{
	static double pi=3.142;
	
	static void area_of_circle()
	{
		int r=7;
		double area = pi*r*r;
		System.out.println(area);
	}
	public static void main(String[] args) 
	{
		
		area_of_circle();
	}

}
