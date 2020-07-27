package demo;
import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		System.out.println("enter the number");
		Scanner scan=new Scanner(System.in);
		int j=scan.nextInt();
		int n=1;
		while(j!=0)
		{
			n=n*j;
			--j;
		}
		System.out.println("the factorial is: "+n);
		scan.close();
	}

}
