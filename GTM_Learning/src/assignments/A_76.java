package assignments;

public class A_76 {

	public static void main(String[] args) 
	{
		int sum=0;
		double average=0;
		int no[] = new int[4];
		no[0]=12;
		no[1]=34;
		no[2]=4;
		no[3]=9;
		
		for(int i=0;i<no.length;i++)
		{
			sum = sum+no[i];
		}
		System.out.println("the addition is " +sum);
		average = sum/no.length;
		
		System.out.println(average);

	}

}
