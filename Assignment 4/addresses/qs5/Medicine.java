package qs5;

public abstract class Medicine {
	float price;
	String expiryDate="";
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	void getDetails()
	{
		System.out.println("price= "+price+"\n expiry Dste= "+expiryDate);
	}
	public abstract void displaylabel();

}
