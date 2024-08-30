package assignments;

import java.util.ArrayList;

public class A101 {

	public static void main(String[] args) 
	{
		 ArrayList a1 = new ArrayList();
	        a1.add("shilpa");
	        a1.add("Sri");
	        a1.add("harika");
	        System.out.println(a1);
	        
	        ArrayList a2 = new ArrayList();
	        a2.addAll(a1);
	        a2.add("chikku");
	        System.out.println(a2);
	        System.out.println(a2.contains("shilpa"));
	        System.out.println(a2.containsAll(a1));
	        System.out.println(a2.isEmpty());
			 ArrayList a3 = new ArrayList();
			 System.out.println(a3.remove("sri"));
			 System.out.println(a3.removeAll(a1));
			 ArrayList a4 = new ArrayList();
			 System.out.println(a4.size());
			 ArrayList a5 = new ArrayList();
			 a5.add("ab");
			 a5.add("cd");
			 a5.add("ef");
			 a5.clear();

	         

	}

}
