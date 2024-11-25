package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment_123 
{
  public static void main(String[] args) 
  {
	  Map<String,Integer> m4 =new HashMap<String,Integer>();
		m4.put("Deepa",85678);
		m4.put("Shourya",85679);
		m4.put("Divya",85670);
		m4.put("Laxmi",45678);
		System.out.println(m4);
		
		for(String s5:m4.keySet())
		{
			System.out.println(s5);
		}
	    
		for(Integer s6:m4.values())
		{
			System.out.println(s6);
		}
	
		
		for(Entry<String, Integer> s7:m4.entrySet())
		{
			System.out.println(s7);
		}
}
	
}
