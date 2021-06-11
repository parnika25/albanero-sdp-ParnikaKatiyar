import java.util.*;
public class Dequeue_Eg 
{
	public static void main(String[] args)
	{
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		System.out.println("Oiginal Queue "+dq);
		dq.clear();

		dq.addFirst(100);
		dq.addFirst(200);
		dq.addFirst(500);
		
		dq.addLast(10);
		dq.addLast(20);
		dq.addLast(50);	

		System.out.println("Dequeue implementation : "+dq);
		dq.removeLast();
		System.out.println("After removing last element : "+dq);
	}
}
