//Iterate the list in reverse order 
import java.util.*;
public class List_Iterator
{
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			al.add(i);

		System.out.println(al);
		ListIterator<Integer> ltr = al.listIterator(al.size());

		while (ltr.hasPrevious())
		{
			System.out.print(ltr.previous() + " ");
		}
		System.out.println();
	}
}
