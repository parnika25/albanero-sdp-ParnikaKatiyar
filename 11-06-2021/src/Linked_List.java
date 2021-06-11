import java.io.*;
import java.util.*;

class Linked_List 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> ll1	= new LinkedList<Integer>();
		for (int i = 1; i <= 5; i++)
			ll1.add(i);
		System.out.println("Linked List 1 : "+ll1);
		ll1.remove(3);
		System.out.println("List after removing the element at index 3 : "+ll1);
		LinkedList<Integer> ll2	= new LinkedList<Integer>();
		for (int i = 11; i <= 15; i++)
			ll2.add(i);
		System.out.println("Linked List 2 : "+ll2);
		ll1.addAll(ll2);
		System.out.println("Merging of Linked List 1 & 2 : " +ll1);
		ll1.addFirst(0);					//Adding the element in the beginning
		ll1.addLast(100);					//Adding the element at the end
		System.out.println(ll1);
		ll1.removeAll(ll2);					//removing the linked list 2
		System.out.println(ll1);			
		ll1.removeFirst();					//Removing the beginning element
		ll1.removeLast();					//Removing the last element
		System.out.println(ll1);
		ll1.clear();						//Clearing the whole list 1
		System.out.println(ll1);			
	}
}
