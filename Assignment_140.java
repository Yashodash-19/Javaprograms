package assignments;

class account
{
	private long acc_no;
	private String name,email;  
	private float amount;
	
	public long getAcc_no()
	{
		return acc_no;
	}
	public void setAcc_no(long acc_no)
	{
		this.acc_no=acc_no;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public float getAmount()
	{
		return amount;
	}
	public void setAmount(float amount)
	{
		this.amount=amount;
	}
	
}
public class Assinment_140 
{
	
public static void main(String[] args) 
	{
	account a1 =new account();
	a1.setAcc_no(123456789);
	a1.setname("shourya");
	a1.setEmail("shouryask@gmail.com");
	a1.setAmount(100000f);
	System.out.println(a1.getAcc_no());
	System.out.println(a1.getname());
	System.out.println(a1.getEmail());
	System.out.println(a1.getAmount());
	}

}
