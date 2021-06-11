import java.util.*;
public class Stack_Eg 
{
	public static void main(String[]args)
	{
		Stack<String> st = new Stack<String>();
		st.push("Ram");
		st.push("Tom");
		st.push("Eric");
		st.push("Krish");
		st.push("Sam");
		Iterator<String> itr = st.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		 System.out.println();
	     st.pop();
	     itr = st.iterator();
	     while(itr.hasNext())
			{
				System.out.print(itr.next()+ " ");
			}
	     System.out.println();
	     Stack st1 = new Stack();
	     st1.push("Hello");
	     st1.push(10);
	     st1.push(1.2);
	     System.out.println(st1);
	}
}
