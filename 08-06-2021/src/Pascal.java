/* Program to print the following pattern 
 					               1
						      1 1
						     1 2 1
						    1 3 3 1
						   1 4 6 4 1 
*/

import java.util.Scanner;
public class Pascal
{
   static int factorial(int n) 
   {
	   int fact=1;
	   for(int i= 1;i<=n;i++)
	    	fact*=i;
      return fact;
   }
   static int nCr(int n,int r) 
   {
      return factorial(n) / ( factorial(n-r) * factorial(r) );
   }
   public static void main(String args[])
   {
	   	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int r=sc.nextInt();
		for(int i = 0; i < r; i++) 
		{
	         for(int k = 0; k <= r-i; k++)
	         {
	            System.out.print(" ");
	         }
	         for(int j = 0; j <= i; j++)
	         {
	            System.out.print(" "+nCr(i, j));
	         }
	         System.out.println();
		}
   }
}

//Time complexity - O(n ^ 2)
