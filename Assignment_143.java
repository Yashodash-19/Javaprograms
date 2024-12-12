package assignments;

public class Assignment_143 {

	public static void main(String[] args) 
	{
		//Implicitly widening
		int a=100;
		double d1=a;
		System.out.println(d1);
		
		//explicitly widening
		int b=200;
		double d2=(double)b;
		System.out.println(d2);
		
		double d=99.99;
		int d3=(int)d;
		System.out.println(d3);
	}

}
