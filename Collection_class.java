package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;
import java.util.LinkedHashSet;
public class Collection_class {

	
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		   a1.add("Monday");
		   a1.add('x');
		   a1.add(100);
		   a1.add(3.14);
		   a1.add(true);
		   a1.add(null);
		   a1.add(null);  //accepts more than one null value
		   a1.add(100);   //accepts duplicates
		   System.out.println(a1);
		   
		   
		   Vector v1=new Vector();
		   v1.add("Monday");
		   v1.add('x');
		   v1.add(100);
		   v1.add(3.14);
		   v1.add(true);
		   v1.add(null);
		   v1.add(null);  //accepts more than one null value
		   v1.add("Monday"); //accepts duplicates
		   Enumeration e1= v1.elements();
		   while(e1.hasMoreElements())
		   {
		      System.out.println(e1.nextElement());
		   }
		   System.out.println(v1);
		   
		   LinkedList l1=new LinkedList();
		   l1.add("Monday");
		   l1.add('x');
		   l1.add(100);
		   l1.add(3.14);
		   l1.add(true);
		   l1.add(null);
		   l1.add(null);  //accepts more than one null value
		   l1.add("Monday"); //accepts duplicates
		   System.out.println(l1);
		   
		   
		   PriorityQueue p1= new PriorityQueue();
		   p1.add(100);
		   p1.add(120);
		   p1.add(130);
		   p1.add(14);
		  // p1.add(null);
		 //  p1.add(null);  //don't accepts more than one null value
		   p1.add(100); //accepts duplicates
		   
		   System.out.println(p1); 
		 
		   
		   TreeSet t1=new TreeSet();
		   t1.add("yashoda");
		   t1.add("Roopa");
		   t1.add("Deepa");
		   t1.add("Divya");
		   t1.add("Divya"); //Don't accept duplicates
		  System.out.println(t1);
		  
		  
		  HashSet h1=new HashSet();
		  h1.add("Monday");
		   h1.add('x');
		   h1.add(100);
		   h1.add(3.14);
		   h1.add(true);
		   h1.add(null);
		   h1.add(null);  //accepts more than one null value
		   h1.add("Monday"); //accepts duplicates
		   System.out.println(h1);
		   
		   LinkedHashSet l2= new LinkedHashSet();
		   l2.add("Monday");
		   l2.add('x');
		   l2.add(100);
		   l2.add(3.14);
		   l2.add(true);
		   l2.add(null);
		   l2.add(null);  //accepts more than one null value
		   l2.add("Monday"); //accepts duplicates
		   System.out.println(l2);


		 
	}

}
