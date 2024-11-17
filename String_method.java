package assignments;

import java.util.Arrays;

public class String_method {

	public static void main(String[] args) 
	{
		String s1="Manish Kumar Tiwari";
		//length
		System.out.println(	s1.length());
		
		//toLowercase
		System.out.println(	s1.toLowerCase());
		
		//toUppercase
		System.out.println(	s1.toUpperCase());
		
		
		String s2="    Yashoda S H";
		
		//trim
		System.out.println(s2);
		System.out.println(s2.trim());
		
		//char at index
		System.out.println(s1.charAt(5));
		
		//substring with one parameter
		System.out.println(s1.substring(7));
		
		//substring with two parameter
		
		System.out.println(s1.substring(5, 9));
		
		//equal
		System.out.println(s1.equals("Shourya"));
		
		//contains
		System.out.println(s1.contains("Tiwari"));
		
		//index of given string
		System.out.println(s1.indexOf('r'));
		
		
		
	char c1[]=s1.toCharArray();
	for(int i=0;i<s1.length();i++)
	{
		System.out.println(c1[i]);
	}
	
	System.out.println(Arrays.toString(c1));

	}

}
