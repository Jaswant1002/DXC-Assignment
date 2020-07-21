package demo;
import java.util.Scanner;
public class AccHolder {
	static Scanner scan;
	public static void main(String args[])
	{
		Account ac=new Account("SB");
		scan=new Scanner(System.in);
		while(true) {
			System.out.println("enter the action\n1.Balance\n2.Withdraw\n3.Deposit\n4.type");
			
			int a=scan.nextInt();
			if(a==0)
				break;	
			switch(a)
			{
			case 1:
				System.out.println(ac.getBalance());
				break;
			case 2:
			{
				System.out.println("enter the amount to withdraw");
				ac.withdraw(scan.nextFloat());
				break;
			}
			case 3:
				System.out.println("enter the amount to deposit");
				ac.deposit(scan.nextFloat());
				break;
			case 4:
				System.out.println(ac.getType());
			default:
				System.out.println("try again");
				break;
			}
			//scan.close();
		}
	}
}


