interface Sentence
{  
    String say(String message);  
}  
  
public class LambdaEg2
{  
    public static void main(String[] args) 
    {   
        Sentence s = (message)-> {  
            String str1 = "This is an Example of ";  
            String str2 = str1 + message;   
            return str2;  
        };  
            System.out.println(s.say("Lambda Expression."));  
    }  
}  