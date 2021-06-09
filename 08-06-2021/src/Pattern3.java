/* Program to print the following pattern 
 					    1 
						2 3 
						4 5 6 
						7 8 9 10 
						11 12 13 14 15 
*/

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

//Time complexity - O(n ^ 2)