import java.util.*;  
public class Base64Eg
{  
    public static void main(String[] args) 
    {  
 
        Base64.Encoder encoder = Base64.getUrlEncoder(); 
        String Str = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());  
        System.out.println("Encoded URL: "+Str);  
        Base64.Decoder decoder = Base64.getUrlDecoder();   
        String dStr = new String(decoder.decode(Str));  
        System.out.println("Decoded URL: "+dStr);  
    }  
} 