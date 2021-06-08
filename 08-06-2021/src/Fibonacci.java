// Program to print the Fibonacci Series
import java.util.*;
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int x =0, y=1, sum =0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value upto which we need to print the fibonacci series.");
		n = sc.nextInt();
		System.out.print(x+ " "+y+" ");
		for(int i=2;i<n;i++)
		{
			sum = x+y;
			System.out.print(sum + " ");
			x = y;
			y = sum;
		}

	}

}
