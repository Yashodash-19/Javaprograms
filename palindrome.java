package assignments;

public class palindrome 
{
	public static void main(String[] args) 
		{
			String input="gadag";
			String output="";
			for(int i=input.length()-1;i>=0;i--)
			{
				char c1=input.charAt(i);
				output=output+c1;
			}
			System.out.println(output);
			
			boolean b=	input.equals(output);
			
			if(b==true)
			{
				System.out.println("it is palindrome");
				
			}
			else
			{
				System.out.println("it is not palindrome");
			}
			
			
		}
			
	}





