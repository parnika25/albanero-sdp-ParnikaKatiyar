import java.util.Scanner;
public class Right_Pascal_Triangle   
{   
	public static void main(String args[])   
	{     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r=sc.nextInt();
		for(int i=0; i<r; i++)   
		{   
			for(int j=0; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
		for(int i=r-1; i>=1; i--)   
		{   
			for(int j=1; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
	}
}   
