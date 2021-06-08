import java.util.Scanner;
public class Right_Down_Mirror_Star_Pattern   
{   
	public static void main(String args[])   
	{     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r=sc.nextInt();
		for(int i=r; i>=1; i--)   
		{   
			for(int k=2*(r-i);k>0;k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
	}
}   
