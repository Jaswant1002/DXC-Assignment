package day3;
import java.util.Scanner;
public class GiftCardTest {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		GiftCard obj1= new GiftCard(1001,5000.0,true);
		System.out.println("enter recharge amount");
		double amount=scan.nextDouble();
		obj1.rechargeCard(amount);
		System.out.println("enter withdraw amount");
		double withdrAwamount=scan.nextDouble();
		obj1.swipeCard(withdrAwamount);
		System.out.println("enter withdraw amount");
		withdrAwamount=scan.nextDouble();
		obj1.swipeCard(withdrAwamount);
		System.out.println(obj1.getCardNo()+obj1.getBalance()+"\n"+obj1.isActive());
		scan.close();
	}
	
	

}
