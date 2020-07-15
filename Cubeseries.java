package demo;
import java.util.Scanner;
public class Cubeseries {
	public static void main(String[] args) {
		int i;
		System.out.println("enter the number of elements");
		Scanner scan = new Scanner(System.in);
			int n=scan.nextInt();
			for(i=1;i<=n;i++)
			{
				System.out.print(i*i*i+",");
			}
			scan.close();
		}
	}



