package Math_Class;

public class Area_OfCircle_NonStatic
{
	double pi_value=Math.PI;
	
	public double area_of_circle(double r) 
	{
	

		double area=pi_value*r*r;
		return area;
	}
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++) 
		{	
			Area_OfCircle_NonStatic a = new Area_OfCircle_NonStatic();
			double r=Math.random();
			//double area1= a.area_of_circle(r); // creating a method to calculate area
			double area = a.pi_value*r*r; //without creating a method to calculate area
			System.out.println(area);
		}
	}

}
