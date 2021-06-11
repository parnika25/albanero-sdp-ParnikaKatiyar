import java.util.*;
public class Tree_Set
{
	public static void main(String args[])
	{
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("Tom");
		ts.add("Eric");
		ts.add("Krish");
		ts.add("Sam");
		ts.add("Tom");

		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}
}
