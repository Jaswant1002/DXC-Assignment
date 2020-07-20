package cricketScore;
import java.util.Scanner;
public class CricketTest {
	 public static void main(String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Target Runs"); 
	 int targetruns=sc.nextInt();
	 System.out.println("Enter Current Over"); 
	  int currentover=sc.nextInt();
	  System.out.println("Enter Current Score"); 
	  int currentscore=sc.nextInt();
	  sc.close();
	  Cricket c=new OneDayCricket();
	  c.setCurrentOver(currentover);
	 c.setCurrentScore(currentscore);
	 c.setTargetScore(targetruns);
	 System.out.println("Current Run Rate="+c.calcCurrentdRunrate()); 
	 System.out.println("Required Run Rate="+c.calcReqdRunrate()); 

	 }

}
