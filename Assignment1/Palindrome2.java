package demo;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		int n,m=0,sum=0;
		System.out.println("enter the num");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=n;
		while(n!=0)
		{
		 sum=sum*10+(n%10);
		 n=n/10;
		}
		if(sum==m)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		scan.close();
	}
	}
