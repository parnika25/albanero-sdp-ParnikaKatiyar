import java.util.*;  
public class For_Each
{  
    public static void main(String[] args) 
    {  
        List<String> li = new ArrayList<String>();  
        li.add("Apple");  
        li.add("Mango");  
        li.add("Cherry");  
        li.add("Papaya");  
        System.out.println("Iterating by passing lambda expression");  
        li.forEach(fruits -> System.out.println(fruits));  
        System.out.println("Iterating by passing method reference");  
        li.stream().forEachOrdered(System.out::println); 
          
    }
}