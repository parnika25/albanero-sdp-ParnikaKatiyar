// Java program to demonstrate Single_Inheritance
class A
{
	public void printA()
	{
		System.out.print("Single Inheritance ");
	}
}
class B extends A
{
	public void printB()
	{
		System.out.print("Example.");
	}
}
public class Single_Inheritance 
{
	public static void main(String[]args)
	{
		B ob1 = new B();
		ob1.printA();
		ob1.printB();
	}
}
