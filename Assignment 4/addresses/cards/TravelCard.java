package cards;
interface Rewardable
{
	int reward(int amount);	
}
public class TravelCard extends PrepaidCard implements Rewardable {
	int rewardPoints;

	@Override
	public int reward(int amount) {	
		return 5*amount/100;
	}
	

}
