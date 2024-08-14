package abstractclass;

abstract class viva_one 
{

	
	public static void main(String[] args)
	{
		//4mrthods with 75 abstraction
		
		//to find all the leap year of 2000 and 2025 included
		
		int rollno[] = new int[4];
		rollno[0]=12;
		rollno[1]=14;
		rollno[2]=67;
		rollno[3]= 50;
		try {
		rollno[4]=60;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("error");
		}
		
		System.out.println(rollno);
		
		
		
		
	}

}
