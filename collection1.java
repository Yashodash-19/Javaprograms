package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class collection1 
{
	public static void main(String[] args) 
	{
		
		//add
	   Collection<Comparable> c1=new ArrayList<Comparable>();
	   c1.add("Monday");
	   c1.add('x');
	   c1.add(100);
	   c1.add(3.14);
	   c1.add("true");
	   c1.add("November");
	   System.out.println(c1);
	  
	   //addAll
	   
	   Collection<Comparable> c2=new ArrayList<Comparable>();
	   c2.addAll(c1);
	   c2.add("Day");
	   c2.add(200);
	   System.out.println(c2);
	   
	   //contains
	boolean b1=   c2.contains("Day");
	   System.out.println(b1);
	   
	   //containsAll
	boolean b2=   c2.containsAll(c1);
	System.out.println(b2);
	   
	//size
   System.out.println(c1.size());
	
/*	//clear
   c2.clear();
   System.out.println(c2);
   */
   //isEmpty
   System.out.println(c2.isEmpty());
   
   //remove
   c1.remove('x');
	System.out.println(c1);
	
	//removeAll
	c2.removeAll(c1);
	System.out.println(c2);
	
	   
	   
	   
	   
	}
	


}
