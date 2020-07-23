package qs5;
import java.util.Random;
public class Testmedicine {
	public static void main(String args[])
	{
		Medicine med[]=new Medicine[5];
		//med[0].setPrice(200);
		med[0].setExpiryDate("12/09/21");
		med[1].setPrice(300);
		med[1].setExpiryDate("13/10/22");
		med[2].setPrice(400);
		med[2].setExpiryDate("14/11/23");
		med[3].setPrice(500);
		med[3].setExpiryDate("15/12/24");
		med[4].setPrice(600);
		med[4].setExpiryDate("16/001/25");
		Random rand = new Random();
		int num=rand.nextInt(4);
		if(num==0)
		{
			Medicine tab=new Tablet();
			tab.getDetails();
			tab.displaylabel();
		}
		else if(num==1)
		{
			Medicine syrup=new Syrup();
			syrup.getDetails();
			syrup.displaylabel();
		}
		else
		{
			Medicine ointment=new Ointment();
			ointment.getDetails();
			ointment.displaylabel();

		}
	}

}