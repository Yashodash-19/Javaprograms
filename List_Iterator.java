package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator
{
	public static void main(String[] args) 
	{
		//properties of List
		List l1=new ArrayList();
		
		// Accepts the heterogeneous Value,index and order of insertion 
		l1.add(100);
		l1.add(-20);
		l1.add("shourya");
		l1.add(3.14);
		l1.add("null");
		
	/*	// Accepts duplicate value
		l1.add(100);
		l1.add(-20);
		l1.add("shourya");
		l1.add(3.14);
		l1.add("null");*/
		
		//Accepts null Values
		 l1.add("null");
		 System.out.println(l1);
		 
		 List l4=new ArrayList();
		 

		 
    ListIterator l2=l1.listIterator();
	
	System.out.println("ListIterator of element forward Iteration");
	
	while(l2.hasNext())
	{
		System.out.println(l2.next());
	}
	    
	System.out.println("ListIterator of element backward Iteration");  
	
	while(l2.hasPrevious())
	{
		System.out.println(l2.previous());
	}
	
	Iterator l3=   l1.iterator();
	
	System.out.println("Iterator of element forward Iteration"); 
	
	while(l3.hasNext())
	{
		System.out.println(l3.next());
	}
	
	}
	
}

