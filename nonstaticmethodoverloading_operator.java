package basicprograme;

public class nonstaticmethodoverloading_operator 
{
	 void Addition(short a,int b)
	{
	 
	 int sum=a+b;
	System.out.println("the addition of two number is -->"+sum);
	}
	 void Addition(int a, int b)
	{
		int sum=a+b;
		System.out.println("the addition of two number is -->"+sum); 
	}
	 void Addition(int a,long b)
	{
		long sum=a+b;
		System.out.println("the addition of two number is -->"+sum);
	}
	 void Addition(byte a,int b)
	{
		int sum=a+b;
		System.out.println("the addition of two number is -->"+sum);
	}
	 void Addition(int a, double b)
	{
		
		double sum=a+b;
		System.out.println("the addition of two number is -->"+sum);
	}
	
	//substarction
	 void Substraction(short a,int b)
	{
	 
	 int sub=b-a;
	System.out.println("the Substraction of two number is -->"+sub);
	}
	 void  Substraction(int a, int b)
	{
		int sub=b-a;
		System.out.println("the Substraction of two number is -->"+sub); 
	}
	 void  Substraction(int a,long b)
	{
		long sub=b-a;
		System.out.println("the Substraction of two number is -->"+sub);
		
	}
	
	//multiplication
	void Multiplication(short a,int b)
	{
	 
	 int multi=b*a;
	System.out.println("the Multiplication of two number is -->"+multi);
	}
	 void   Multiplication(int a, int b)
	{
		int multi=b*a;
		System.out.println("the Multiplicationof two number is -->"+multi); 
	}
	 void   Multiplication(int a,long b)
	{
		long multi=b*a;
		System.out.println("the Multiplication  of two number is -->"+multi);
	}
	
	//divide
	 void division(short a,int b)
	{
	 
	 int div=b/a;
	System.out.println("the division of two number is -->"+div);
	}
	void   division(int a, int b)
	{
		int div=b/a;
		System.out.println("the division of two number is -->"+div); 
	}
	 void  division(int a,long b)
	{
		long div=b/a;
		System.out.println("the division of two number is -->"+div);
	}
	//modulus
	 void modulus(short a,int b)
	{
	 
	 int mod=b%a;
	System.out.println("the modulus of two number is -->"+mod);
	}
	 void   modulus(int a, int b)
	{
		int mod=b%a;
		System.out.println("the modulus of two number is -->"+mod); 
	}
	 void  modulus(int a,long b)
	{
		long mod=b%a;
		System.out.println("the modulus of two number is -->"+mod);
	}
	public static void main(String[] args)
	{
		nonstaticmethodoverloading_operator n1=new nonstaticmethodoverloading_operator ();
		n1.Addition(3,20);
		n1.Addition(10,20);
		n1.Addition(100,2034567890);
		n1.Substraction(3,20);
		n1.Substraction(10,20);
		n1.Substraction(100,2034567890);
		n1.Multiplication(3,20);
		n1.Multiplication(10,20);
		n1.Multiplication(100,2034567890);
		n1.division(5,20);
		n1.division(10,20);
		n1.division(100,2034567890);
		n1.modulus(5,20);
		n1.modulus(10,20);
		n1.modulus(100,2034567890);
	}


}



