package assignments;

import java.util.Scanner;

class name
{
	static void name1()
	{
		System.out.println("yashoda");
		
	}
	void add()
	{
		int a=20;
		int b=30;
		int sum=a+b;
		System.out.println("sum of 2 num is --->"+sum);
	}
	
}
class age extends name
{
	int x;
	int y;
	
	void sub()
	{
		
		System.out.println("multi inheritance");
		
	}
	static void age1()
	
	{
		System.out.println("4");
	}
}

public class multiinheritance extends age
{
	public static void main(String[] args) 
	{
		name1();
		age1();
		multiinheritance m1=new multiinheritance();
	    m1.add();
	    m1.sub();
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of x");
		int x=s1.nextInt();
		System.out.println("enter the value of y");
		int y=s1.nextInt();
		int sub=x-y;
		System.out.println("sub of 2 num is -->"+sub);
		
		
	}

}
