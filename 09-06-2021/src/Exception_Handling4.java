public class Exception_Handling4
{
	public static void main(String[]args)
	{
		try
		{
			int div = 100/0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
