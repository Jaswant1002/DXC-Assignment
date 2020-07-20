package day3;
import java.util.Scanner;
public class Account {
	static Scanner scan=new Scanner(System.in);
	static int balance=0;
	public static void main(String args[])
	{
	System.out.println("enter account status if active preess 1 else 0");
	int status= scan.nextInt();
	System.out.println("balance amount INR: "+depositAmount(status));
	}
	static int depositAmount(int status)
	{
		int deposit;
		if(status==1)
		{
		System.out.println("enter the deposit amount");
		deposit=scan.nextInt();
		balance+=deposit;
		return balance;
		}
		else
			System.out.println("account inactive");
		return balance;
	}
}
