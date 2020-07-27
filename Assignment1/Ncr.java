package demo;
import java.util.Scanner;
public class Ncr {
	public static void main(String args[])
	{
		System.out.println("enter the n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); 
		System.out.println("enter the r");
		int r=scan.nextInt();
		int ncr=fact(n)/(fact(n-r)*fact(r));
		System.out.println(ncr);
	}
	public static int fact(int j) 
	{
		int n=1;
		while(j!=0)
		{
			n=n*j;
			--j;
		}
	
		return n;
	}
}