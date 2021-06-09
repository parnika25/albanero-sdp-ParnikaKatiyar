// Program to check whether the number is prime or not
import java.util.Scanner;
public class prime 
{
	public static void main(String[] args) 
	{
		int flag =0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		n = sc.nextInt();
		if(n==0||n==1)
		{  
		   System.out.println(n+" is not a prime number");      
		}
		else
		{
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if((n%i) == 0)
					flag++;
			}
			if(flag == 0)
			{
			  System.out.println(n + " is a prime number");
			}
			else
			{ 
		      System.out.println(n + " is not a prime number");
			}
		}
	}

}

// O(sqrt(n))