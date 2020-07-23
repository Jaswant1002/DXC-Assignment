package assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreCard {
	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter runs Scored by: \nRahane,\nRahul,\nKolhi,\nDhoni,\nRahul");
		for (int i = 0; i < array.length; i++)
			array[i] = scan.nextInt();

		map.put("Rahane", array[0]);
		map.put("Rahul", array[1]);
		map.put("Kohli", array[2]);
		map.put("Dhoni", array[3]);
		map.put("Rahul", array[4]);

		int maximimScore = 0, sum = 0;

		for (Map.Entry<String, Integer> me : map.entrySet()) {
			
			System.out.print(me.getKey() + ":");
			System.out.println(me.getValue());
			if (maximimScore < me.getValue()) {
				maximimScore = me.getValue();
			}
			sum = sum + me.getValue();
		}
		System.out.println("The total Score is: "+sum);
		System.out.println("The max run scored is"+ maximimScore);
		scan.close();
		
		

	}

}
