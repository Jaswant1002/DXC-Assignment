package studentmark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> marks = new ArrayList<>();
	int sum = 0;
	System.out.println("Enter number of Students");
	int numberOfStudent = scan.nextInt();
	System.out.println("Enter marks");
	for (int i = 0; i < numberOfStudent; i++) {
		marks.add(scan.nextInt());
	}
	int max = marks.get(0);
	Iterator<Integer> itr = marks.iterator();
	while (itr.hasNext()) {
		int check = itr.next();
		if (max < check)
			max = check;
		sum = sum + check;
	}
	double avg = sum / numberOfStudent;
	System.out.println("The Highest marks is :" + max);
	System.out.println("The average marks is : " + avg);
	System.out.println("Third student marks is " + marks.get(2));
	Collections.sort(marks);
	for (int i = 0; i < marks.size(); i++) {
		System.out.print(i+1 + "-" + marks.get(i)+" ");
	}
	scan.close();

}

}
