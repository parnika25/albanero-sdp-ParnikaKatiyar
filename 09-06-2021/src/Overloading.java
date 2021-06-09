// Java program to demonstrate Method Overloading
class Multiplication 
{
	public int Multiply(int a, int b)
	{
		return a * b;
	}

	public double Multiply(double a, double b)
	{
		return a * b;
	}
	
	public int Multiply(int a, int b, int c)
	{
		return a * b* c;
	}
}

public class Overloading 
{
	public static void main(String[] args)
	{
		Multiplication ob1= new Multiplication();
		System.out.println("Multiplication of 2 int values :" +ob1.Multiply(5,10));
		System.out.println("Multiplication of 2 double values :" +ob1.Multiply(2.5,5.5));
		System.out.println("Multiplication of 3 int values :" +ob1.Multiply(5,10,25));
	}
}
