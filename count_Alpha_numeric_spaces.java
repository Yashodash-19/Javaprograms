package assignments;

import java.util.Arrays;

public class count_Alpha_numeric_spaces
{
    static   int count_alphabet=0;
    static   int count_numeric=0;
    static   int count_spaces=0;

	public static void main(String[] args) 
	{
		
		String s1="kv no 2 @#$";
		char[] c1=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<s1.length();i++)
		{
			boolean v1= Character.isAlphabetic(c1[i]);
			boolean v2= Character.isDigit(c1[i]);
		    boolean v3= Character.isWhitespace(c1[i]);
		
		if(v1==true)
		{
			count_alphabet++;
		}
		
		if(v2==true)
		{
			count_numeric++;
		}
		
		if(v3==true)
		{
			count_spaces++;
		}
		}
		
		
		System.out.println("The count of alphates in the given array ->" +count_alphabet);
		System.out.println("The count of numeric in the given array ->" +count_numeric);
		System.out.println("The count of spaces in the given array ->" +count_spaces);
		System.out.println("The count of special charcters in the given array ->" +(c1.length-(count_alphabet+count_numeric+count_spaces)));
	}

}
