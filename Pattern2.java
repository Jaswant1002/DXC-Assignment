package demo;

public class Pattern2 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{ for(int j=1;j<=5-i-1;j++)
		{
			System.out.print(" ");
		}

		for(int j=5-i;j<=5;j++)
		{ 
			System.out.print(j);
		}
		for(int j=0;j<i;j++)
		{
			System.out.print(5-j-1);
		}

		System.out.println(" ");
		}
	}}

