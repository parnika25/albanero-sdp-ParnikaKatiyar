// Java program to demonstrate Multilevel_Inheritance
class X
{
	public void printX()
	{
		System.out.print("MultiLevel ");
	}
}
class Y extends X
{
	public void printY()
	{
		System.out.print("Inheritance ");
	}
}
class Z extends Y
{
	public void printZ()
	{
		System.out.print("Example.");
	}
}
public class Multilevel_Inheritance   
{
	public static void main(String[]args)
	{
		Z ob1 = new Z();
		ob1.printX();
		ob1.printY();
		ob1.printZ();
	}
}


