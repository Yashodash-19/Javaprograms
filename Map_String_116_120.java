package assignments;

import java.util.HashMap;
import java.util.Map;

public class Map_String_116_120
{
	public static void main(String[] args) 
	{
		
		Map<String,String> m1 =new HashMap<String,String>();
		m1.put("Deepa", "Bangalore");
		m1.put("Divya", "Gadag");
		m1.put("Laxmi", "Belagavi");
		m1.put("Sanidhya", "Bagalkot");
		System.out.println(m1);
		
		
		Map m2 =new HashMap();
		m2.put("Yashoda", 123);
		m2.put("Siya", "ram");
		m2.put(123, "Swati");
		System.out.println(m2);
		
		Map<String,String> m3 =new HashMap<String,String>();
		m3.put("Yashoda", "F");
		m3.put("Shankar", "M");
		m3.put("Shourya", "M");
		m3.put("Deepa", "F");
		System.out.println(m3);
		
		Map<String,Integer> m4 =new HashMap<String,Integer>();
		m4.put("Deepa",85678);
		m4.put("Shourya",85679);
		m4.put("Divya",85670);
		m4.put("Laxmi",45678);
		System.out.println(m4);

		//putAll
	    m3.putAll(m1);
	    System.out.println(m3);
	
		
		
		

	}

}
