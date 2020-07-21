package cards;
import java.util.Scanner;
public class TestCard {
	public static void main(String[] args) {
		TravelCard tc=new TravelCard();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		int amount=sc.nextInt();
		sc.close();
		if(tc.swipeCard(amount)==false)

			System.out.println("Try Again");

		else
		{tc.rewardPoints=tc.reward(amount);
		System.out.println("Previous balance="+tc.availableBalance);
		System.out.println("Available balance="+(tc.availableBalance-amount));
		System.out.println("Reward Points="+tc.reward(amount));
		System.out.println("Card no="+tc.CardNo);



		}

	}

}
