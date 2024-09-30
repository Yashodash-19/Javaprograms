package assignments;

class parent
{
	void test()
	{
		
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
	}
}

public class Superkey extends parent
{
	void test()
	{
		
		int a=30;
		int b=20;
		int sum=a*b;
		System.out.println(sum);
		super.test();
		
	}
	public static void main(String[] args)
	{
		Superkey s1=new Superkey();
		s1.test();
		

}
}
