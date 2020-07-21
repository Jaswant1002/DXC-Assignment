package officeadress;

public class Customer {
	String customerName;
	Address residentialAddress;
	Address officialAddress;
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
	
	public Address getOfficialAddress() {
		return officialAddress;
	}
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	String getCustomerDetails()
	{
		String str1="Customer : "+customerName+"\nResidential Address : "+residentialAddress+"\noffice Address="+officialAddress;		
		return str1;
	}
}
