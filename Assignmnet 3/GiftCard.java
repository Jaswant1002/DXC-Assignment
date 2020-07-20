package day3;

public class GiftCard {
	private long cardNo;
    private double balance;
    private boolean active;
    
	public GiftCard(long cardNo, double balance, boolean active) {
		super();
		this.cardNo = cardNo;
		this.balance = balance;
		this.active = active;
	}
	public GiftCard()
	{
	 this.balance=0;
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public void rechargeCard(double amount) {
		if(this.active==true)
			this.balance+=amount;
			
	}
	public void swipeCard(double amount) {
		if(this.active==true)
			this.balance-=amount;
	}
}
