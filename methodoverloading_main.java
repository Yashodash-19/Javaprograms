package basicprograme;

public class methodoverloading_main
{
   public static void main(String[] args)
   {
	   System.out.println("main method");
	   methodoverloading_main  m1=new methodoverloading_main();
	   m1.main();
	   main("Yashoda",'F');
	  
	 }

	void main()
	{
		System.out.println("Main method with no arguments");
	}

	static void main(String name,char gender)
	{
		System.out.println("Main method with argument as Name and gender");
	}
}
