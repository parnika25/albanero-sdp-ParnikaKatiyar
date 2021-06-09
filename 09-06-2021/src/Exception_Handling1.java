public class Exception_Handling1 
{
	public static void main(String[]args)
	{
		try
		{
			int div = 100/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
}
