import java.util.*;  
public class String_join 
{  
    public static void main(String[] args) 
    {  
        StringJoiner joinNames = new StringJoiner(", ", "[", "]");      
        joinNames.add("Sam");  
        joinNames.add("Krish");  
        joinNames.add("Eric");  
        joinNames.add("Tom");  
        System.out.println(joinNames);  
        System.out.println("Length : "+joinNames.length());
    }  
} 