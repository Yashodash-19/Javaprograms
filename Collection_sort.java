package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class Collection_sort {

	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(20);
		a1.add(5);
		a1.add(90);
		a1.add(30);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("yashoda");
		   l2.add("Roopa");
		   l2.add("Deepa");
		   l2.add("Divya");
		   l2.add("Divya");
		   System.out.println(12);
			Collections.sort(l2);
			System.out.println(l2);
		
		 Vector<Integer> v1=new Vector<Integer>();
		 v1.add(200);
			v1.add(500);
			v1.add(900);
			v1.add(300);
			System.out.println(v1);
			Collections.sort(v1);
			System.out.println(v1);
			
			 LinkedList<Integer> l1=new LinkedList<Integer>();
			 l1.add(2);
				l1.add(5);
				l1.add(9);
				l1.add(3);
				System.out.println(l1);
				Collections.sort(l1);
				System.out.println(l1);
				
			/*	 PriorityQueue p1= new PriorityQueue();
				   p1.add(100);
				   p1.add(120);
				   p1.add(130);
				   p1.add(14);
				   System.out.println(p1);
				   Collections.sort(p1); */
				
			/*	 TreeSet<String> t1=new TreeSet<String>();
				   t1.add("yashoda");
				   t1.add("Roopa");
				   t1.add("Deepa");
				   t1.add("Divya");
				   t1.add("Divya"); 
				  System.out.println(t1);
				Collections.sort(t1);  */
				
			/*	HashSet<Integer> h1=new HashSet<Integer>();
				h1.add(23);
				   h1.add(43);
				   h1.add(100);
				   h1.add(13);
				   System.out.println(h1);
				   Collections.sort(h1);  */
				
				
			/*	LinkedHashSet<String> l2= new LinkedHashSet<String>();
				l2.add("yashoda");
				   l2.add("Roopa");
				   l2.add("Deepa");
				   l2.add("Divya");
				   l2.add("Divya"); 
				  System.out.println(l2);
				Collections.sort(l2);   */
				   
	}

}
