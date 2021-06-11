import java.io.*;
import java.util.*;

class Arr_Vect_Hash 
{
	public static void main(String[] args)
	{
		int arr[] = new int[] { 1, 2, 3, 4 };
		Vector<Integer> v = new Vector<Integer>();
		Hashtable<Integer, String> h = new Hashtable();
		v.addElement(1);								//Adding elements into the vector
		v.addElement(2);
		
		h.put(1, "Computer");							//Adding elements into the hashtable
		h.put(2, "Programming");
		
		System.out.println(arr[0]);						// Accessing the first element of the array, vector and hashtable
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));

	}
}
