package basicprograme;

public class StringFunction
{
	public static void main(String[] args)
	{
		
	
	String s="Javaprogram";
	int l1=s.length();
	System.out.println(l1);
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	char c1=s.charAt(4);
	System.out.println(c1);	
	System.out.println(s.charAt(6));
	String b=" is object oriented";
	System.out.println(s.concat(b));
	System.out.println(s.concat(" is platform independent"));
	String c=" automation test eng ";
	System.out.println(c);
	System.out.println(c.trim());
	System.out.println(c.isEmpty());
	System.out.println(s.substring(4));
	System.out.println(s.substring(4,8));
}
}