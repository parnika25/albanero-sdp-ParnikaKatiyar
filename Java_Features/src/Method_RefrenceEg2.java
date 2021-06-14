interface Text
{  
    Message getMessage(String msg);  
}  
class Message
{  
    Message(String msg)
    {  
        System.out.print(msg);  
    }  
}  
public class Method_RefrenceEg2 
{  
    public static void main(String[] args) 
    {  
        Text m = Message::new;  
        m.getMessage("This is an example of Method Refrence");  
    }  
} 
