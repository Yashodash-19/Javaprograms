package assignments;
interface Electric_Car
{
	void drive();
	void electric_Kit();
}
interface Petrol_Car
{
	void drive();
	void petrol_Kit();
}

public class multipleinheritance implements Electric_Car,Petrol_Car
{

	
	public void petrol_Kit() 
	{
		
		System.out.println("using petrol kit for car");
	}

	
	public void drive() 
	{
		System.out.println("driving car");
		
	}

	
	public void electric_Kit() 
	{
		
		System.out.println("using electric kit for car");
	}
public static void main(String[] args) 
{
	multipleinheritance m1=new multipleinheritance();
	m1.drive();
	m1.electric_Kit();
	m1.petrol_Kit();
}
}
