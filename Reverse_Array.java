package assignments;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) 
	{
	  int a1[]=new int[4];
	  a1[0]=56;
	  a1[1]=67;
	  a1[2]=89;	  
	  a1[3]=100;
	  System.out.println(Arrays.toString(a1));
	  
	  int output[]=new int[a1.length];
	  for(int i=0,j=3;i<a1.length;i++,j--)
	  {
		 output[j]=a1[i];
	  
	  
	}
	  System.out.println(Arrays.toString(output));
	}
	 
}
