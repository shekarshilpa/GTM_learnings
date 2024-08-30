package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class A_105 {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("shilpa");
		a1.add("sri");
		a1.add("harika");
		
	System.out.println(a1);
	Iterator i1 = a1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
		

	}

}
