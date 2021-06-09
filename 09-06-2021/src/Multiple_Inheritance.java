// Java program to demonstrate Multiple_Inheritance
interface I
{
	public void printI();
}
interface J
{
	public void printJ();
}
class K implements I,J
{
	public void printI()
	{
		System.out.print("Multiple Inheritance ");
	}
	public void printJ()
	{
		System.out.print("Example.");
	}
}
public class Multiple_Inheritance 
{
	public static void main(String[]args)
	{
		K ob1 = new K();
		ob1.printI();
		ob1.printJ();
	}
}

