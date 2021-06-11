import java.util.*;
class Enum_Map 
{
	enum Color 
	{
		RED, GREEN, BLUE, WHITE
	}

	public static void main(String[] args) 
	{
		EnumMap<Color, Integer> colors = new EnumMap<>(Color.class);
		colors.put(Color.RED, 1);
		colors.put(Color.GREEN, 2);
		colors.put(Color.BLUE, 3);
		colors.put(Color.WHITE, 4);
		System.out.println("EnumMap colors : " + colors);
		System.out.println("Key-Value mappings: " + colors.entrySet());
		System.out.println("Key Set : " + colors.keySet());
		System.out.println("Values: " + colors.values());
		System.out.println("Value of RED : " + colors.get(Color.RED));
	}
}
