package assignments;

public class Matches_Repeat {

	public static void main(String[] args) 
	{
		String s1="axe";
		
	System.out.println(	s1.matches("..."));
	
	System.out.println(s1.matches("a(.*)"));
	
	System.out.println(s1.matches("(.*)e"));
	
	String s2="manishtiwari";
	System.out.println(s2.matches("(.*)y(.*)"));
	
	System.out.println(s2.repeat(5));
	
	System.out.println(s2.lastIndexOf('i'));
	
	
		
	}
}
