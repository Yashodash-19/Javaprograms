package assignments;

class test3
{
	test3(int a)
	{
		a=12;
		double circle=Math.PI*a*a;
		System.out.println(circle);
	}
	
	
}
class test4 extends test3
{
	test4(int x,int y)
	{
		
		super(12);
		int mul=x*y;
		System.out.println(mul);
		
	}
	
}


public class Parameter_supercall extends test4
{

	Parameter_supercall() 
	{
		super(20,40);
		System.out.println("test4");
		
	}

	public static void main(String[] args) 
	{
		new Parameter_supercall();
		System.out.println("main");

	}

}
