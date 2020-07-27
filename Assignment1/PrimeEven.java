package demo;

import java.util.Scanner;

public class PrimeEven {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1=sc.nextInt();
		System.out.println("Enter the last number");
		int number2=sc.nextInt();
		for(int i=number1;i<=number2;i++)
			System.out.println(i);	
		sc.close();
	}

}
