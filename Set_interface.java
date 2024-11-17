package basicprograme;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set_interface {

	public static void main(String[] args) 
	{
	
		 
		
       Set s1=new HashSet();
		
		// Accepts the heterogeneous Value,index and order of insertion 
		s1.add(100);
		s1.add(-20);
		s1.add("shourya");
		s1.add(3.14);
		s1.add("null");
		
	// Don't Accepts duplicate value
		s1.add(100);
		s1.add(-20);
		s1.add("shourya");
		s1.add(3.14);
		s1.add("null");
		
		//Accepts only one null Value
		 s1.add("null");
		 System.out.println(s1);
		 
		 Iterator t1=s1.iterator();
		 while(t1.hasNext())
		 {
			 System.out.println(t1.next());
		 }
		
		 
	}

}
