package basicprograme;

public class staticmethodonverloading_operator 
{
	
	
static void Addition(short a,int b)
	{
	 
	 int sum=a+b;
	System.out.println("the addition of two number is -->"+sum);
	}
	static void Addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("the addition of two number is -->"+sum); 
	}
	static void Addition(int a,long b)
	{
		long sum=a+b;
		System.out.println("the addition of two number is -->"+sum);
	}
	static void Addition(byte a,int b)
	{
		int sum=a+b;
		System.out.println("the addition of two number is -->"+sum);
	}
	static void Addition(int a, double b)
	{
		
		double sum=a+b;
		System.out.println("the addition of two number is -->"+sum);
	}
	
	//substarction
	static void Substraction(short a,int b)
	{
	 
	 int sub=b-a;
	System.out.println("the Substraction of two number is -->"+sub);
	}
	static void  Substraction(int a, int b)
	{
		int sub=b-a;
		System.out.println("the Substraction of two number is -->"+sub); 
	}
	static void  Substraction(int a,long b)
	{
		long sub=b-a;
		System.out.println("the Substraction of two number is -->"+sub);
		
	}
	
	//multiplication
	static void Multiplication(short a,int b)
	{
	 
	 int multi=b*a;
	System.out.println("the Multiplication of two number is -->"+multi);
	}
	static void   Multiplication(int a, int b)
	{
		int multi=b*a;
		System.out.println("the Multiplicationof two number is -->"+multi); 
	}
	static void   Multiplication(int a,long b)
	{
		long multi=b*a;
		System.out.println("the Multiplication  of two number is -->"+multi);
	}
	
	//divide
	static void division(short a,int b)
	{
	 
	 int div=b/a;
	System.out.println("the division of two number is -->"+div);
	}
	static void   division(int a, int b)
	{
		int div=b/a;
		System.out.println("the division of two number is -->"+div); 
	}
	static void  division(int a,long b)
	{
		long div=b/a;
		System.out.println("the division of two number is -->"+div);
	}
	//modulus
	static void modulus(short a,int b)
	{
	 
	 int mod=b%a;
	System.out.println("the modulus of two number is -->"+mod);
	}
	static void   modulus(int a, int b)
	{
		int mod=b%a;
		System.out.println("the modulus of two number is -->"+mod); 
	}
	static void  modulus(int a,long b)
	{
		long mod=b%a;
		System.out.println("the modulus of two number is -->"+mod);
	}
	public static void main(String[] args)
	{
		Addition(3,20);
		Addition(10,20);
		Addition(100,2034567890);
		Substraction(3,20);
		Substraction(10,20);
		Substraction(100,2034567890);
		Multiplication(3,20);
		Multiplication(10,20);
		Multiplication(100,2034567890);
		division(5,20);
		division(10,20);
		division(100,2034567890);
		modulus(5,20);
		modulus(10,20);
		modulus(100,2034567890);
	}


}
