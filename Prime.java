package demo;

import java.util.Scanner;

public class Prime {
	public static void main(String args[])
	{
		int flag=0;
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int j=scan.nextInt();
		if(j==2)
			System.out.println("Prime number");
		else
		{
		for(int i=2;i<=j/2;i++)
		{
				if(j%i==0)
					flag=0;
				else
					flag=1;
			}
		if(flag==0)
			System.out.println("Not prime");
		else
			System.out.println("prime");
		}
		scan.close();
	}
}


