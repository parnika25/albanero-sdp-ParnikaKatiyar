// Program to print the Fatorial of a number
import java.util.*;
public class Factorial 
{
	public static void main(String[] args) 
	{
		int n,fact=1;    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number :");
	    n = sc.nextInt();
	    for(int i= 1;i<=n;i++)
	    	fact*=i;
	    System.out.println("Factorial of "+n+" is "+fact);

	}

}
//Time complexity - O(n)