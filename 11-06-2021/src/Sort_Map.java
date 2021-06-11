import java.util.*;
public class Sort_Map
{
	public static void main(String[] args)
	{
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(12, "Mango");
		sm.put(33, "Apple");
		sm.put(44, "Banana");
		sm.put(25, "Guava");
		sm.put(1, "Cherry");
		System.out.println(sm);
	    Set s = sm.entrySet();
		Iterator i = s.iterator();
		while (i.hasNext()) 
		{
			Map.Entry<Integer,String> m = (Map.Entry)i.next();

			int key = m.getKey();
			String value = m.getValue();

			System.out.println("Key : " + key
							+ " value : " + value);
		}
	}
}
//put() to add a pair
//remove() to remove the pair