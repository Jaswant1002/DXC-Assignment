package exception;

public class ExceptionTest {
	public static void main(String args[])
	{
		int result=0;
		try
		{
			result=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Division with zero is not possible");
		}
		catch(NullPointerException e)
		{
			System.out.println("No Input received");
		
		}
		catch(NumberFormatException ex)
		{
		       System.out.print("Only integers are allowed");
		   }
		System.out.println(result);
	}

}
