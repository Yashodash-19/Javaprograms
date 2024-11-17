package assignments;

public class Array2 
{
	public static void main(String[] args) 
	{
		int	age[] =new int[4];
		age[0]=5;
		age[1]=15;
		age[2]=50;	
		age[3]=35;
		int given_no=35;
		
		for(int i=0;i<=3;i++)
		{
		if(given_no==age[i])
		{
			System.out.println("Yes given no is present");
			System.out.println("indexing is--->" +i);
		}
		
		}	
	}

}
