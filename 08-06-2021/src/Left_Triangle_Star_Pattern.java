import java.util.Scanner;
public class Left_Triangle_Star_Pattern   
{   
	public static void main(String args[])   
	{     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r=sc.nextInt();
		for(int i=0; i<r; i++)   
		{   
			for(int k=2*(r-i-1); k>=0; k--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
	}
}   
