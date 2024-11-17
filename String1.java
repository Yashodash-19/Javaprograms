package assignments;

import java.util.Arrays;

public class String1 
{
	public static void main(String[] args) 
	{
		String s1="Manish Kumar Tiwari";
	String s2=	s1.replaceAll("[a-z]", "").replace(" ","");
		System.out.println(s2);
		
		
		
		String s3="Manish Kumar Tiwari";
		String s4=	s3.replaceAll("[a-z]", "").replace(" ","");
		
		for(int i=0; i<s4.length();i++)
		{
		System.out.println(s4.charAt(i));
		}
		
		
	}
}
