import java.util.*;
import java.io.*;
public class Arr_List 
{
	public static void main(String[]args) 
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();		//ArrayList Created
		for(int i=0;i<10;i++)
		{
			arr.add(i);
		}
		System.out.print("Original Array : ");
		System.out.println(arr);								//Printing the array list
		arr.remove(4);											//Removing the element at particular index
		System.out.print("Array after removing the element at index 4 : ");
		for(int elements : arr)
			System.out.print(elements+" ");						//Printing the elements of the array
		System.out.println();
		arr.set(4, 100);
		System.out.print("Array after updating the index 4 : ");
		for (int i=0;i<arr.size();i++) 
		{
            System.out.print(arr.get(i) + " ");
        }
	}
}
