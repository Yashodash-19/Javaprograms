package assignments;

import java.util.Arrays;

public class Array_int {

	public static void main(String[] args) 
	{
	int	age[] =new int[5];
	age[0]=5;
	age[1]=15;
	age[2]=25;	
	age[3]=35;
	age[4]=45;
	System.out.println(Arrays.toString(age));
	
	
	String name[]=new String[5];
	name[0]="shourya";
	name[1]="Deepa";
	name[2]="Divya";
	name[3]="Satwik";
	name[4]="sanidya";
	System.out.println(Arrays.toString(name));
	
	double	area[] =new double[5];
	area[0]=5.123;
	area[1]=15.456;
	area[2]=25.789;
	area[3]=35.012;
	area[4]=45.345;
	System.out.println(Arrays.toString(area));
	
	char alpha[]=new char[5];
	alpha[0]='a';
	alpha[1]='b';
	alpha[2]='c';
	alpha[3]='d';
	alpha[4]='e';
	System.out.println(Arrays.toString(alpha));
	
	boolean True[]=new boolean[5];
	True[0]=true;
	True[1]=false;	
	True[2]=true;
	True[3]=false;
	True[4]=true;
	System.out.println(Arrays.toString(True));
	
	}

}
