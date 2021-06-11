public class Genric_class<T>
{
	T obj;
	public Genric_class(T obj)
	{
		this.obj = obj;
	}
	public T getValue()
	{
		return obj;
	}
	public static void main(String[]args)
	{
		Genric_class <Integer> obj1=new Genric_class<Integer>(10);
		System.out.println(obj1.getValue());
		Genric_class <String> obj2=new Genric_class<String>("Hello World");
		System.out.println(obj2.getValue());
	}
}
