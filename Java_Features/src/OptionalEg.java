import java.util.*;  
public class OptionalEg {  
    public static void main(String[] args) 
    {  
        String[] str = new String[10];        
        str[5] = "THIS IS A JAVA OPTIONAL CLASS EXAMPLE";  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent())
        {   
            String lowercase = str[5].toLowerCase();  
            System.out.print(lowercase);  
        }
        else  
            System.out.println("String value is not present");  
    }  
}