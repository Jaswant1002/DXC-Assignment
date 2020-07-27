package demo;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {

	       
        int remainder, checkVar = 0;
        System.out.println("enter the number");
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
        int m = n;

        while (m != 0)
        {
            remainder = m % 10;
            checkVar += Math.pow(remainder, 3);
            m /= 10;
        }

        if(checkVar == n)
            System.out.println("Armstrong number");
        
        else
            System.out.println("Not Armstrong number");
        scan.close();
    }

}
