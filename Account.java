package demo;

public class Account {
	float balance;
	String type="";
	public Account(String s)
	{
		this.balance=0;
		this.type=s;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getBalance() {
		return balance;
	}
	public void withdraw(float p)
	{
		if(p<this.balance)
			this.balance=this.balance-p;
		else
			System.out.println("low balance");
	}
	public void deposit(float q)
	{
		this.balance+=q;
	}
	
}
