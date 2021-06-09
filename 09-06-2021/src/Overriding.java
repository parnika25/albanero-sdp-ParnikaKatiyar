// Java program to demonstrate Method Overriding
class Parent 
{
	void print()
	{
		System.out.println("PARENT CLASS");
	}
}

class Child extends Parent 
{

	void print()
	{
		System.out.println("CHILD CLASS");
	}
}

class Child2 extends Parent 
{

	void print()
	{
		System.out.println("CHILD CLASS 2");
	}
}

public class Overriding  
{
	public static void main(String[] args)
	{
		Parent ob1;
		ob1= new Parent();
		ob1.print();
		
		ob1 = new Child();
		ob1.print();
		
		ob1 = new Child2();
		ob1.print();

	}
}

