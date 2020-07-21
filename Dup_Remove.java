package demo;
	import java.util.Arrays;
	import java.util.Scanner;
	public class Dup_Remove {
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array that is to be created::");
	      int size = sc.nextInt();
	      int[] myArray = new int[size];
	      System.out.println("Enter the elements of the array ::");
	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.nextInt();
	      }
	      
	      System.out.println("The array created is ::"+Arrays.toString(myArray));
	      for(int i=0;i<size;i++)
	      {
	    	  for(int j=0;j<size;j++)
	    	  {
	    		  if(i==j)
	    			  continue;
	    		if (myArray[i]==myArray[j])
	    		{
	    			
	    			for(int k=j;k<size-1;k++)
	    			{
	    				myArray[k] = myArray[k + 1];
	    			}
	    			size=size-1;
	    		}
	    			
	    	  }
	    	  
	      }
	      for(int i=0; i<size; i++) {
	    	  System.out.print(myArray[i]+" ");
		      }
	      sc.close();
	   }
	}