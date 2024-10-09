package assignments;
abstract class animalsound
{
	abstract void dog();
	abstract void cat();
}


public class Abstract_class extends animalsound
{

	
	void dog() 
	{
		
		System.out.println("barks barks");
	}

	
	void cat() 
	{
		System.out.println("meow meow");
		
	}
public static void main(String[] args)
{
	Abstract_class a1=new Abstract_class();
	a1.dog();
	a1.cat();
}
}
