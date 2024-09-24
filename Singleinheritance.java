package assignments;

import java.util.Scanner;

class one
{
	static void mul()
	{
		int a;
		int b;
	}
	static void sub()
	{
		 int x=10;
		 int y=20;
		 int sub=y-x;
		 System.out.println(sub);
		 

	}
}

public class Singleinheritance extends one
{
	static void div()
	{
		int x;
		int y;
	
	}
	
	
	static void add()
	{
		int x=10;
		 int y=20;
		 int add=x+y;
		 System.out.println(add);
	}
	
 public static void main(String[] args) 
 {
	add();
	sub();
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

