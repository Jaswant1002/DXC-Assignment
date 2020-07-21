package addresses;
import java.util.Scanner;
public class TestCustomer {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		Customer customer=new Customer();
		Address address=new Address("mahendra bagchi road","Kolkata");
		//System.out.println("enter customer name");
		//(scan.nextLine());
		customer.setCustomerName("Abhinav");
		//System.out.println("enter customer address");
		customer.setResidentialAddress(address);
		System.out.println(customer.getCustomerDetails());
		//customer.getResidentialAddress();
		scan.close();
	}

}
