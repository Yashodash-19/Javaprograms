package assignments;

import java.util.Scanner;

class test1
{
	int a;
	int b;
	test1()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=s1.nextInt();
		System.out.println("enter the value of b");
		b=s1.nextInt();
		int sum=a+b;
		System.out.println("additon of two no -->"+sum);
	}
}
class test2 extends test1
{
     double x;
     int y;
     test2()
 {
    super();
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the value of x");
	x=s1.nextInt();
	System.out.println("enter the value of y");
	y=s1.nextInt();
	double sub=x-y;
	System.out.println("Substraction of two no --->"+sub);
 }
	
}

public class Nonparameter_Supercall extends test2
{
	

	public static void main(String[] args) 
	{
		
		new Nonparameter_Supercall();
		
		 
		
		
		
	}
	

}
