package demo;

import java.util.Scanner;

public class Format100 {
	public static void main(String args[])
	{
		int n,p,q,r;
		Scanner scan=new Scanner(System.in);
		String[] arr09={" ", "one","two","three ", "four ", 
				"five ", "six ", "seven ", "eight ", 
				"nine ", "ten ", "eleven ", "twelve ", 
				"thirteen ", "fourteen ", "fifteen ", 
				"sixteen ", "seventeen ", "eighteen ", 
		"nineteen "};
		String[] arr10= { "", "", "twenty ", "thirty ", "forty ", 
				"fifty ", "sixty ", "seventy ", "eighty ", 
		"ninety " };
		while(true)
		{
			System.out.println("enter the num");
			
			n= scan.nextInt();
			if(n==0)
				break;
			
			if(n==100)
				System.out.println("One Hundred");
			else if(n<19)
				System.out.println(arr09[n]);
			else if(n<100)
			{
				p=n%10;
				q=n/10;
				System.out.println(arr10[q]+" "+arr09[p]);
			}
			else
			{
				p=n%10;
				int m=n;
				m=m/10;
				q=m%10;
				r=n/100;
				System.out.println(arr09[r]+" hundred "+arr10[q]+" "+arr09[p]);
			}   
		}
		scan.close();
	}
}
