package assignments;

public class A_98
{

	public static void main(String[] args) 
	{
		String s = "AutomationTESTING";
		boolean ans = s.equalsIgnoreCase("automationtesting");
		System.out.println(ans);
		
		boolean ans1=s.endsWith("G");
		System.out.println(ans1);
		
		String s2 ="";
		boolean ans2 = s2.isEmpty();
		System.out.println(ans2);
		
		String s3 = "software";
		String s4 = s3.repeat(5);
		System.out.println(s4);
		

	}

}
