package basicprograme;

public class operators
{
	static void Addition()
	{
		int a=20;
		int b=40;
		int sum=a+b;
		System.out.println("the addition of two number is -->"+sum);
	}
	static void Substraction()
	{
		int a=20;
		int b=40;
		int sub=b-a;
		System.out.println("the substraction of two number is -->"+sub);
	}
	static void multiplication()
	{
		int a=20;
		int b=40;
		int multi=b*a;
		System.out.println("the multiplication of two number is -->"+multi);
	}
	static void Division()
	{
		int a=20;
		int b=40;
		int div=b/a;
		System.out.println("the division of two number is -->"+div);
	}
	static void modulus()
	{
		int a=20;
		int b=6;
		int mod=b%a;
		System.out.println("the modulus of two number is -->"+mod);
	}
	
	
	public static void main(String[] args)
	{
		Addition();
		Substraction();
		multiplication();
		Division();
		 modulus();
	}

}
