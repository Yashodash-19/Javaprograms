package assignments;

public class reverse_string 
{
public static void main(String[] args) 
{
	String input="Shourya";
	String output="";
	for(int i=6;i>=0;i--)
	{
		char c1=input.charAt(i);
		output=output+c1;
		
	}
	System.out.println(output);
}
}
