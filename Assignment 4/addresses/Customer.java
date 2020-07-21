package addresses;

public class Customer {
	String customerName;
	Address residentialAddress;
	public Customer() {
		super();
	}
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	String getCustomerDetails()
	{
		String str1="Customer : "+customerName+"Residential Address : "+residentialAddress;		
		return str1;
	}
}
