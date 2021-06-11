import java.util.*;

public class Navi_Map
{
	public static void main(String[] args)
	{
		NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();

		nm.put("C", 123);
		nm.put("Y", 954);
		nm.put("A", 445);
		nm.put("T", 555);
		nm.put("B", 764);
		nm.put("A", 555);
		System.out.println("Mappings of NavigableMap : "+ nm);
		System.out.printf("Reverse Map : %s%n", nm.descendingMap());
		System.out.printf("Ascending Set : %s%n", nm.keySet());
		System.out.printf("Descending Set : %s%n", nm.descendingKeySet());
		System.out.printf("Floor Entry : %s%n", nm.floorEntry("Z"));
		System.out.printf("First Entry : %s%n", nm.firstEntry());
		System.out.printf("First Key : %s%n", nm.firstKey());
		System.out.printf("Last Key : %s%n", nm.lastKey());
		nm.remove("T");
		System.out.printf("Map after removing T : %s%n", nm);
	}
}
