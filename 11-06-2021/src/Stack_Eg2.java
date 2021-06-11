import java.util.*;

class Stack_Eg2
{
	// Pushing the element on the top of the stack
	static void stack_push(Stack<Integer> st)
	{
		for(int i=0; i<5; i++)
		{
			st.push(i);
		}
		System.out.println("Push Operation done");
	}
	
	// Popping element from the top of the stack
	static void stack_pop(Stack<Integer> st)
	{
		System.out.println("Pop Operation:");

		for(int i=0;i<5;i++)
		{
			Integer y =st.pop();
			System.out.print(y+" ");
		}
		System.out.println();
	}

	// Displaying element on the top of the stack
	static void stack_peek(Stack<Integer> st)
	{
		Integer element = st.peek();
		System.out.println("Element on stack top: " + element);
	}
	
	// Searching element in the stack
	static void stack_search(Stack<Integer> st, int element)
	{
		Integer pos = st.search(element);

		if(pos == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element is found at position: " + pos);
	}


	public static void main (String[] args)
	{
		Stack<Integer> st = new Stack<Integer>();

		stack_push(st);
		stack_pop(st);
		stack_push(st);
		stack_peek(st);
		stack_search(st, 2);
		stack_search(st, 6);
	}
}
