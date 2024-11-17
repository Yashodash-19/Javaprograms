package basicprograme;
public class nestedif
{
public static void main(String[] args) 
{
	char gender1='M';
	char gender2='F';
	int age=40;
	if(gender1=='F')
	{
				if(age>12)
				{
					System.out.println("Adult fare");
				}
				else
				{
					System.out.println("half ticket");
				}
	}
	else
	{
		if(age>12)
		{
			if(age>12)
			{
				System.out.println("Adult fare");
			}
			else
			{
				System.out.println("half ticket");
			}
		}
		else
		{
			System.out.println("half ticket");
		}
		System.out.println("Its free for FEMALE");
	}
	
	
}
	
}
