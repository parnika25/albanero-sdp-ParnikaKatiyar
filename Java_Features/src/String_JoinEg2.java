import java.util.StringJoiner;

public class String_JoinEg2 
{
	public static void main(String[] args) 
    {  
        StringJoiner joinNames = new StringJoiner(", ", "[", "]");      
        joinNames.add("Sam");  
        joinNames.add("Krish");  
        joinNames.add("Eric");  
        joinNames.add("Tom");  
        System.out.println("First : "+joinNames);  
        System.out.println("Length : "+joinNames.length());
        StringJoiner joinNames2 = new StringJoiner(", ", "[", "]");      
        joinNames2.add("1");  
        joinNames2.add("2");  
        joinNames2.add("3");  
        joinNames2.add("4");  
        System.out.println("Second : "+joinNames2); 
        System.out.println("Length : "+joinNames2.length());
        StringJoiner merge = joinNames.merge(joinNames2);   
        System.out.println("Merging : "+merge);
        System.out.println("Length after merging : "+merge.length());
    }
}