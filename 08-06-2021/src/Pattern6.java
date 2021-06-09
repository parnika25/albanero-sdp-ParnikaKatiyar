/* Program to print the following pattern 
 					1 
					2 1 
					3 2 1 
					4 3 2 1 
					5 4 3 2 1  
*/

import java.util.Scanner;
public class Pattern6
{   
	public static void main(String args[])   
	{     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r=sc.nextInt();
		for(int i=1; i<=r; i++)   
		{   
			for(int j=i; j>=1; j--)   
			{   
				System.out.print(j+" ");   
			}   
			System.out.println();   
		}   
	}
}   
//Time complexity - O(n ^ 2)