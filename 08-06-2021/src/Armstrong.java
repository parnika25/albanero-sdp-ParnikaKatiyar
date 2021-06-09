// Program to check whether the entered number is an armstrong or not
import java.util.*;
public class Armstrong 
{
	public static void main(String[] args) 
	{
		int n,x,rev,sum=0,c=0 ;    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number :");
	    x = sc.nextInt();
	    n=x;  
	    for (;n != 0; n /= 10, ++c);
	    n=x;
	    while(n!=0)
		{    
	      rev=n%10;  
	      sum=sum +(int) (Math.pow(rev, c));    
	      n=n/10;  
	    }	      
	    if(x == sum)  	  
	    	System.out.println("Armstrong number"); 
	    else    
	    	System.out.println("Not an Armstrong number");      

	}

}

// Time complexity - No of digits in a number
