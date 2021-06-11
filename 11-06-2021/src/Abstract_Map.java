import java.util.*;
public class Abstract_Map
{

	public static void main(String[] args)
	{
		AbstractMap<Integer, String> absMap = new HashMap<Integer, String>();

		absMap.put(1, "This");
		absMap.put(3, "is");
		absMap.put(2, "an");
		absMap.put(4, "AbstractMap");
		System.out.println("Set view : "+absMap.entrySet());
		absMap.remove(3);
		System.out.println("Updated map : "+absMap);
	}
}
