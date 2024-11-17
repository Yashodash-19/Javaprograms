package basicprograme;

public class nonstatic_operators
{
	
		 void Addition()
		{
			int a=100;
			int b=2000;
			int sum=a+b;
			System.out.println("the addition of two number is -->"+sum);
		}
		void Substraction()
		{
			int a=1000;
			int b=2000;
			int sub=b-a;
			System.out.println("the substraction of two number is -->"+sub);
		}
		 void multiplication()
		{
			int a=20;
			int b=40;
			int multi=b*a;
			System.out.println("the multiplication of two number is -->"+multi);
		}
		 void Division()
		{
			int a=20;
			int b=40;
			int div=b/a;
			System.out.println("the division of two number is -->"+div);
		}
		 void modulus()
		{
			int a=20;
			int b=6;
			int mod=b%a;
			System.out.println("the modulus of two number is -->"+mod);
		}
		
		
		public static void main(String[] args)
		{
			nonstatic_operators n=new nonstatic_operators();
			n.Addition();
			n.Substraction();
			n.multiplication();
			n.Division();
			n.modulus();
		}

	}



