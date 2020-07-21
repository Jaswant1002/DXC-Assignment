package officeadress;

public class Address {

	@Override
	public String toString() {
		return "Address= " + addressLine + ", city=" + city ;
	}
	String addressLine;
	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
	String city;
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	String getAddressDetails()
	{
		String str=addressLine+" ,"+city;
		return str;
	}
}

