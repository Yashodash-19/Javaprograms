package basicprograme;

import java.util.Scanner;

public class areaoftriangle 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of b");
		int b=s1.nextInt();
		System.out.println("enter the value of h");
		int h=s1.nextInt();
		double triangle=0.5*b*h;
		System.out.println("area of triangle is -->"+triangle);
		
	}
	

}
