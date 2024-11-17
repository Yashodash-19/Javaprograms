package basicprograme;

public class Non_static
{
	
   void add()
   {
	  System.out.println("addition of two numbers"); 
   }
   
   static void substraction()
   {
	   System.out.println("substraction of two numbers");
   }
   
   void multiplication()
   {
	   System.out.println("multiplication of two numbers"); 
   }
   public static void main(String[] args) {
	
	   Non_static n1=new Non_static();
	   n1.add();
	   substraction();
	   n1.multiplication();
	   
}

}
