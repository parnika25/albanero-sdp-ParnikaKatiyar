// Program to check whether the entered number is a palindrome or not
import java.util.*;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		int n,x,rev,sum=0;    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number :");
	    n = sc.nextInt(); 
	    x=n;    
	    while(n!=0)
		{    
	      rev=n%10;  
	      sum=(sum * 10) + rev;    
	      n=n/10;  
	    }	      
	    if(x == sum)  	  
	    	System.out.println("Palindrome number"); 
	    else    
	    	System.out.println("Not a Palindrome number");      

	}

}
