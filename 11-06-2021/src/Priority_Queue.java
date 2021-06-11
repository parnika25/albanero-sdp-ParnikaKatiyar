import java.util.*;

class Priority_Queue 
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(10);
		pq.add(100);
		pq.add(1000);
		System.out.println("The top of the queue : "+pq.peek());
		pq.poll();
		System.out.println("The top of the queue after poll() : "+pq.peek());
	}
}
