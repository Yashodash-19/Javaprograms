package assignments;

public class Average_array 
{
	public static void main(String[] args) 
	{
		double a1[]=new double[5];
		a1[0]=21;
		a1[1]=32;
		a1[2]=43;
		a1[3]=54;
		a1[4]=67;
		double sum=0;
		for(int i=0;i<a1.length;i++)
		{
			sum=sum+a1[i];
			
		}
		System.out.println(sum);
		double average=sum/a1.length;
		System.out.println(average);
		
	}

}
