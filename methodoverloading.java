package basicprograme;

public class methodoverloading
{
	static void Addition(double a,double b)
	{
		
		double sum=a+b;
		System.out.println(sum);
	}
	static void Addition(int a,int b)
	{
		
		int sum=a+b;
		System.out.println(sum);
	}
	static void Addition(double a,int b)
	{
		
		double sum=a+b;
		System.out.println(sum);
	}
	static void Addition(int a,double b)
	{
		
		double sum=a+b;
		System.out.println(sum);
	}
	//non static methodoverloading
	 void Addition1(double c,double d)
	{
		
		double sum=c+d;
		System.out.println(sum);
	}
	 void Addition1(int a,int b)
	{
		
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Addition(7.143,9.012);
		Addition(6,9);
		Addition(8.567,4);
		Addition(3,6.567);
		methodoverloading m=new methodoverloading();
		m.Addition1(10.890, 1.893);
		m.Addition1(9,13);
		
	}

}
