/* Program to print the following pattern 
 					* * * * * 
					* * * * 
					* * * 
					* * 
					* 
*/
import java.util.Scanner;
public class Downward_Triangle_Star_Pattern   
{   
	public static void main(String args[])   
	{     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r=sc.nextInt();
		for(int i=r; i>=1; i--)   
		{   
			for(int j=1; j<=i; j++)   
			{   
				System.out.print("* ");   
			}   
			System.out.println();   
		}   
	}
}   

//Time complexity - O(n ^ 2)