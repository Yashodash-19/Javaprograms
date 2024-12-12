package assignments;

public class Assigment_142 
{
	static
	{
		System.out.println("SIB block");
	}
	{
		System.out.println("IIB1 block");
	}
	{
		System.out.println("IIB2 block");
	}
	
	{
		System.out.println("IIB3 block");
	}
	Assigment_142()
	{
		System.out.println("constructor 1");
	}
	
	Assigment_142(int a)
	{
		System.out.println("constructor 2");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method");
		Assigment_142 a=new Assigment_142();
		Assigment_142 a1=new Assigment_142(30);
		
	}

}
