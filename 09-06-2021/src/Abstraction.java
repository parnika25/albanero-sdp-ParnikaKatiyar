// Java program to demonstrate Abstraction
abstract class Shape 
{
	String color;
	abstract double area();
    abstract String to_String();

	Shape(String color)
	{
		System.out.println("Shape constructor called");
		this.color = color;
	}

	public String getColor() 
	{ 
		return color; 
	}
}
class Circle extends Shape 
{
	double radius;

	Circle(String color, double radius)
	{
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	double area()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	String to_String()
	{
		return "Colour of circle is " + getColor() + " and area is : " + area();
	}
}
class Rectangle extends Shape 
{

	double length;
	double width;

	public Rectangle(String color, double length, double width)
	{
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	double area() 
	{ 
		return length * width; 
	}

	String to_String()
	{
		return "Colour of rectangle is " + getColor() + " and area is : " + area();
	}
}
public class Abstraction 
{
	public static void main(String[] args)
	{
		Shape s1 = new Circle("Red", 10);
		Shape s2 = new Rectangle("Yellow", 20, 40);

		System.out.println(s1.to_String());
		System.out.println(s2.to_String());
	}
}
