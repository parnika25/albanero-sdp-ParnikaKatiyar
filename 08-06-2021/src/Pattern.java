/* Program to print the following pattern 
 					        * 
							* * 
							* * * 
							* * * * 
							* * * * * 
*/

import java.util.*;
public class Pattern   
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
	}
}   

//Time complexity - O(n ^ 2)