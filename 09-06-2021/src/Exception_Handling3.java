public class Exception_Handling3
{
	public static void main(String[]args)
	{
		int x=100, y=0, res;
		try
		{
			res=x/y;
		}
		catch(Exception e)
		{
			System.out.println(x/(y+2));
		}
	}
}
