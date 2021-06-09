// Java program to demonstrate Hierarchial_Inheritance
class A1
{
	public void printA1()
	{
		System.out.print("Hierarchial ");
	}
}
class B1 extends A1
{
	public void printB1()
	{
		System.out.print("Inheritance ");
	}
}
class C1 extends A1
{
	public void printC1()
	{
		System.out.print("Example.");
	}
}
public class Hierarchial_Inheritance   
{
	public static void main(String[]args)
	{
		B1 ob1 = new B1();
		ob1.printA1();
		ob1.printB1();
		C1 ob2 = new C1();
		ob2.printC1();
	}
}


