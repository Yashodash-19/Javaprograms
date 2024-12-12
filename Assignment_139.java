package assignments;

public class Assignment_139 {

	public static void main(String[] args) 
	{
		try
		  {
			  int a=4/0;
			  System.out.println();
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("There is a problem");
		  }
		finally
		{
			System.out.println("Finally block will always execute");
		}
	}

}
