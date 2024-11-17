package basicprograme;

import java.util.Scanner;

public class areaofrectangle 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of l");
		int l=s1.nextInt();
		System.out.println("enter the value of b");
		int b=s1.nextInt();		
		int rectangle=l*b;
		System.out.println("area of the rectangle is -->"+rectangle);
		
	}

}
