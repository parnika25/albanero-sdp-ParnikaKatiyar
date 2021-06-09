// Java program to demonstrate Encapsulation
class Encapsulate 
{
	private String Name;
	private int Roll;
	private int Age;

	public void setAge(int myAge) 
	{ 
		Age =myAge; 
	}

	public void setName(String myName)
	{
		Name = myName;
	}

	public void setRoll(int myRoll) 
	{ 
		Roll = myRoll; 
	}
	
	public int getAge() 
	{ 
		return Age; 
	}

	public String getName() 
	{ 
		return Name; 
	}

	public int getRoll() 
	{ 
		return Roll; 
	}

}

public class Encapsulation 
{
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		obj.setName("Parnika");
		obj.setAge(19);
		obj.setRoll(12345);

		System.out.println("Name: " + obj.getName());
		System.out.println("Age: " + obj.getAge());
		System.out.println("Roll: " + obj.getRoll());
	}
}
