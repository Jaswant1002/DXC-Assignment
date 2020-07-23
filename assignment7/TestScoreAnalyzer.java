package assignment7;

import java.util.Scanner;

public class TestScoreAnalyzer {
public static void main(String[] args) {
		
		ScoreAnalyzer obj =new ScoreAnalyzer();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of Batsmen");
		int noOfBatsmen = scan.nextInt();
		
	
		for (int i=0;i<noOfBatsmen;i++)
		{
			System.out.println("Enter the Runs Scored by Batsmen: "+(i+1));
			obj.addRunsToList(scan.nextInt());
		}
		obj.displayRuns();
		System.out.println("The Run Rate"+obj.calcRunRate());
		System.out.println("Lowest Run Scored"+obj.lowestRunsScored());
		System.out.println("The no of players who batted"+noOfBatsmen);
		scan.close();
			

	}

}
