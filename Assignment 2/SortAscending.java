package demo;

import java.util.Scanner;

public class SortAscending {
	public static void main(String ar[])
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int num=scan.nextInt();
		int array[]=new int[num];
		System.out.println("Enter the elements");
		for(int i=0;i<num;i++)
			array[i]=scan.nextInt();
		
	for(int i=0;i<num-1;i++)
	{
		for(int j=0;i<=(num-i)-1;j++)
		{
			 if (array[j] > array[j+1]) 
             { 
                 int temp = array[j]; 
                 array[j] = array[j+1]; 
                 array[j+1] = temp; 
             } 
		}
	}
		scan.close();
	}

}
