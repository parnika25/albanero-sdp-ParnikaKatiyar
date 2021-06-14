import java.util.*;
public class Priority_set 
{
    public static void main(String[] args) 
    {
        Comparator<Integer> comparator = new SortingComparator();
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10, comparator);
        queue.add(500);
        queue.add(100);
        queue.add(800);
        queue.add(200);
        queue.add(400);
        while (queue.size() != 0) 
        {
            System.out.println(queue.poll());
        }
    }
}

class SortingComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) 
    {
        if (x < y) 
        {
            return 1;
        }
        if (x > y) 
        {
            return -1;
        }
        return 0;
    }
}