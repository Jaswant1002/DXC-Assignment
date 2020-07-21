package cards;

public abstract class PrepaidCard {
	int CardNo=12345;
	double availableBalance=900;
	double swipeLimit=400;
		public boolean swipeCard(int amount)
		{ 
		if(amount<swipeLimit && amount<availableBalance)
			return true;
		else
			return false;
		}
	 public void rechargeCard(int amount)
	 { int availableBalance = 0;
		 int x=amount+availableBalance;
	 }
	}
	
