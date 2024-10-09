package assignments;

import java.util.Arrays;

public class Array1 
{
	

	public static void main(String[] args) 
	{
		int[] jerseyno = new int[4];
		jerseyno[0]=1;
		//jerseyno[0]=10; //updating array value
		jerseyno[1]=45;
		jerseyno[2]=18;
		jerseyno[3]=7;
		System.out.println(Arrays.toString(jerseyno));
		/*for(int i=0;i<=3;i++)
		{
			System.out.println(jerseyno[i]);
		
		}*/
		String[] playersname = new String[3];
		
		
		playersname[0]="Rahul";
		playersname[1]="Rohit";
		playersname[2]="Virat";
		System.out.println(Arrays.toString(playersname));
		/*for(int i=0;i<=3;i++)
		{
			System.out.println(playersname[i]);
		
	   }*/
}
}


