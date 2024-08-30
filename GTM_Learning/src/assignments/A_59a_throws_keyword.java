package assignments;

public class A_59a_throws_keyword {

	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
		String name ="shilpa";
		System.out.println(name);
		throw new InterruptedException("sorry");

	}

}
