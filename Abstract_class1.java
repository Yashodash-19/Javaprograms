package assignments;

import java.util.Scanner;

abstract class animalsound1
{
	abstract void dog();
	abstract void cat();
	static void add()
	{
      int a=10;
      int b=10;
      int sum=a+b;
      System.out.println(sum);
		
	}
	 void mul()
	 {
		 int a;
		 int b;
		 Scanner s1=new Scanner(System.in);
		 System.out.println("enter the value of a");
		 a=s1.nextInt();
		 System.out.println("enter the value of b");
		 b=s1.nextInt();
		 double mul=a*b;
		 System.out.println("muliplication of 2 num is -->"+mul);
	 }
}



public class Abstract_class1 extends animalsound1
{

	
	void dog() 
	{
		
		System.out.println("barks barks");
	}

	
	void cat() 
	{
		System.out.println("meow meow");
		
	}
public static void main(String[] args)
{
	Abstract_class1 a1=new Abstract_class1();
	a1.dog();
	a1.cat();
	animalsound1.add();
	a1.mul();
}
}


