package demo;

import java.util.Arrays;
import java.util.Scanner;

public class CountFreq {
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the text");
	      String str= sc.next();
	      int size = str.length();
	      int count=1;
	      char [] myArray = new char[size];
	      for(int i=0;i<size;i++)
	      {
	    	  myArray[i]=str.charAt(i);
	      }
	      for(int i=0;i<size;i++)
	      {
	    	  count=1;
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
	    			count+=1;
	    			size=size-1;
	    		}
	    			
	    	  }
	    	 System.out.println(myArray[i]+"--->"+count); 
	      }
	      sc.close();
	   }
	}