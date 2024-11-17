package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Array_runtime {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		int rollno[]=new int[4];
		int rollno1[]=new int[4];
		for(int i=0;i<=3;i++)
		{
			System.out.println("Enter the value for index " +i);
			rollno[i]=s1.nextInt();
			rollno1[i]=s1.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		boolean b1=Arrays.equals(rollno, rollno1);
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("Two arrays are equal");
			
		}
		else
		{
			System.out.println("Two arrays are not equal");
			
		}
	}
	

}
