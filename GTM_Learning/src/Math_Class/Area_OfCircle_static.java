package Math_Class;

public class Area_OfCircle_static 
{
	   static double pi_value=Math.PI;  //Math.PI holds the value of Pi that is 3.14
	   
	   /*public static double area_of_circle( double r) 
		{
			double area=pi_value*r*r;
			return area;
		}
		*/
	public static void main(String[] args) 
	{
		for(int i=0;i<=5;i++) 
		{
		double r = Math.random();
		//double area = area_of_circle(r); // creating a method and calling
		double area = pi_value*r*r; // calling directly without creating a method
		System.out.println(area);
	}

}
}

