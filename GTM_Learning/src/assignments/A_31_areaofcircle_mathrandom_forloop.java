package assignments;

public class A_31_areaofcircle_mathrandom_forloop 
{
	static double value_of_pi=Math.PI;


	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++)
		{
		double r = Math.random();
		double area_of_circle=value_of_pi*r*r;
		System.out.println(area_of_circle);


		}

	}

}
