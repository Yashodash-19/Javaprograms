package basicprograme;

import java.util.Scanner;

public class circumfernceofcircle 
{

	 public static void main(String[] args) 
	 {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of pi");
		double pi=s1.nextDouble();
		System.out.println("enter the value of r");
		int r=s1.nextInt();
		double circum=2*pi*r;
		System.out.println("circumference of circle is-->"+circum);

}
}