import java.util.Scanner;
public class Pattern3
{   
	public static void main(String args[])   
	{     
		int k=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r=sc.nextInt();
		for(int i=1; i<=r; i++)   
		{   
			for(int j=1; j<=i; j++)   
			{   
				System.out.print(k+++" ");   
			}   
			System.out.println();   
		}   
	}
}   
