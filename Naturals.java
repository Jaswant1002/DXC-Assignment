package demo;
import java.util.Scanner;
public class Naturals {
	 public static void main(String args[])
	 {
		 System.out.println("enter the number");
	  Scanner scan=new Scanner(System.in);
	  int n=scan.nextInt(); 
	  int sum=0;
	  while(n!=0)
	  {
	   sum+=n%10;
	   n=n/10;
	   }
	  System.out.print(sum);
	  scan.close();
	 }
	}
