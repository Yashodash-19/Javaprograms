package assignments;

import java.util.Arrays;

public class array_duplicatevalue 
{
	public static void main(String[] args) 
	{
		int[] jerseyno = new int[4];
		jerseyno[0]=1;
		jerseyno[1]=45;
		jerseyno[2]=18;
		jerseyno[3]=7;
		
		System.out.println(Arrays.toString(jerseyno));
		
		String[] playersname = new String[4];
		
		
		playersname[0]="Rahul";
		playersname[1]="Rohit";
		playersname[2]="Virat";
		playersname[3]="Rahul"; //duplicate value
		
		System.out.println(Arrays.toString(playersname));
		
		
		
	}

}
