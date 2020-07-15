package demo;

public class Pattern3 {
	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++)
		{  for(int j=1;j<=i;j++)
		{
			System.out.print(" ");
		}

		for(int j=1;j<=n-i;j++)
		{
			System.out.print(j);
		}

		for(int j=n-i-1;j>=1;j--)
		{ 
			System.out.print(j);
		}
		System.out.println("");
		}
	}
}


