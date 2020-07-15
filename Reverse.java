package demo;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		int n,rev=0;
		System.out.println("enter the num");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		while(n!=0)
		{
		 rev=rev*10+(n%10);
		 n=n/10;
		}
			System.out.println(rev);
		scan.close();
	}
	}

