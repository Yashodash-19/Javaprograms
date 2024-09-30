package assignments;

public class Thisclass 
{
	Thisclass(int a)
	{
		this(20,30,10);
		int mul=a*a;
		System.out.println(mul);
	}
	Thisclass(int a,int b)
	{
		this(4);
		int add=a+b;
		System.out.println(add);
	}
	Thisclass(int x,int y,int z)
	{
		int sum=x+y+z;
		System.out.println(sum);
	}
	Thisclass()
	{
		this(2,4);
		System.out.println("string");
		
	}
	public static void main(String[] args) 
	{
		
      Thisclass T1=new Thisclass();
      System.out.println("main");
	}

}
