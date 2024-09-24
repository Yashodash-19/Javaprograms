package assignments;
import java.util.Scanner;
class two
	{
		void mul()
		{
			int a;
			int b;
		}
		 void sub()
		{
			 int x=10;
			 int y=20;
			 int sub=y-x;
			 System.out.println(sub);
			 

		}
	}

	public class nonstatic_singleinheritance  extends two
	{
		 void div()
		{
			int x;
			int y;
		
		}
		
		
		 void add()
		{
			int x=10;
			 int y=20;
			 int add=x+y;
			 System.out.println(add);
		}
		
	 public static void main(String[] args) 
	 {
		nonstatic_singleinheritance n1=new nonstatic_singleinheritance();
		n1.add();
		n1.sub();
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of a");
		int a=s1.nextInt();
		System.out.println("enter the value of b");
		int b=s1.nextInt();
		int mul=a*b;
		System.out.println("multiplication of 2 num is -->"+mul);
		System.out.println("enter the value of x");
		int x=s1.nextInt();
		System.out.println("enter the value of y");
		int y=s1.nextInt();
		double div=x%y;
		System.out.println("division of 2 num is -->"+div);
		
		 

	}
	}

	
