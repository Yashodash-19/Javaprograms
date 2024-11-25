package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment_121_127 {

	public static void main(String[] args) 
	{
		Map<String,String> m1 =new HashMap<String,String>();
		m1.put("Deepa", "Bangalore");
		m1.put("Divya", "Gadag");
		m1.put("Laxmi", "Belagavi");
		m1.put("Sanidhya", "Bagalkot");
		System.out.println(m1);
		
		//putIfAbsent
		m1.putIfAbsent("Divya", "Gadag");
		System.out.println(m1);
		
		Map m2 =new HashMap();
		m2.put("Yashoda", 123);
		m2.put("Siya", "ram");
		m2.put(123, "Swati");
		System.out.println(m2);
		
		//putIfAbsent
		m2.putIfAbsent("Shourya", 7012020);
		System.out.println(m2);
		
		//equals
	boolean b1=	m1.equals(m2);
	System.out.println(b1);
		
	//remove key and key and value
	//m2.remove("Shourya");
	//System.out.println(m2);	
	//m1.remove("Sanidhya", "Bagalkot");
	//System.out.println(m1);	
	
	//get
	System.out.println(m1.get("Sanidhya"));
	
	//contains
	
	System.out.println(m1.containsKey("Deepa"));
	System.out.println(m1.containsValue("Bangalore"));
	
	//clear and empty
	m2.clear();
	System.out.println(m2);
	System.out.println(m2.isEmpty());
	
	
	

	}

}
