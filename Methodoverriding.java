package assignments;


class parentclass
{
	void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
		
	}
}

public class Methodoverriding extends parentclass
{
	
	void add()
	{
		int a=30;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Methodoverriding m1=new Methodoverriding();
		m1.add();
	}

}
