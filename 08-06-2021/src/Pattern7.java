/* Program to print the following pattern 
 					1 2 3 4 5 
					2 3 4 5 1 
					3 4 5 1 2 
					4 5 1 2 3 
					5 1 2 3 4 
*/

import java.util.Scanner;
public class Pattern7
{  
	public static void main(String[] args)   
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r=sc.nextInt(); 
		for(int i=1;i<=r ;i++)  
		{  
		for(int j=i; j <= r ;j++)  
		{  
		System.out.print(j + " ");  
		}  
		for(int k=1; k < i ;k++)  
		{  
		System.out.print(k + " ");  
		}  
		System.out.println();  
		}  
	}  
}

//Time complexity - O(n ^ 2)