package basicprograme;

public class constructoroverloading 
{
	constructoroverloading()
	{
		System.out.println("1st constructor");
	}
	constructoroverloading(int a)
	{
		System.out.println("2nd constructor");
	}
	constructoroverloading(int a,int b)
	{
		System.out.println("3rd constructor");
	}
	public static void main(String[] args)
	{
		new constructoroverloading();
		new constructoroverloading(50);
		new constructoroverloading(100,500);
	}

}
