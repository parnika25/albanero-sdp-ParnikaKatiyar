public class Exception_Handling2 
{
	public static void main(String[]args)
	{
		try
		{
			int div = 100/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
