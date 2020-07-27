package demo;

public class LargesstElement {
	public static void main(String args[])
	{ 
		int array[] = {10, 11, 13, 76, 2}; 
		int max = array[0];
		for (int i = 1; i < 5; i++) 
            if (array[i] > max) 
                max = array[i]; 
       System.out.println("Largest number = "+max);
	}
}
