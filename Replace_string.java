package assignments;

public class Replace_string 
{
	public static void main(String[] args) 
	{
		String s1="automation";
		
	System.out.println(s1.replace('a', 'm'));
	
	String s2="automation testing";
	System.out.println(s2.replace("automation", "api"));
	
	String s3="Manish Kumar Tiwari";
	 System.out.println(s3.replaceAll("[A-Z]", ""));
	 
	 String s4="Manish Kumar Tiwari";
	 System.out.println(s4.replaceAll("[a-z]", ""));
	 
	 String s5="kv no 2";
	 System.out.println(s5.replaceAll("[0-9]", ""));
	 
	}

}
