import java.util.*;
class Hash_map 
{	
	public static void main(String args[])
	{
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");

		hm2.put(4, "four");
		hm2.put(5, "five");
		hm2.put(6, "six");
		hm2.put(7, "seven");

		System.out.println("Mappings of HashMap hm1 are : " + hm1);
		System.out.println("Size of hm1 : " +hm1.size());
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
		System.out.println("Size of hm2 : " +hm2.size());
		if(hm1.containsKey(3))
			System.out.println("Map of 3 : " +hm1.get(3));
	}
}
