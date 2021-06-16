interface TestInterface1
{
	default void show()
	{
		System.out.println("Default TestInterface 1");
	}
}

interface TestInterface2
{
	default void show()
	{
		System.out.println("Default TestInterface 2");
	}
}

class Default implements TestInterface1, TestInterface2
{
	public void show()
	{
		TestInterface1.super.show();
		TestInterface2.super.show();
	}

	public static void main(String args[])
	{
		Default d = new Default();
		d.show();
	}
}
