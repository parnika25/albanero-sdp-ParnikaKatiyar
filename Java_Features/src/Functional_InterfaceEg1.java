interface Inter1
{  
    default void message()
    {  
        System.out.println("Do it now");  
    }  
}    
interface Inter2 extends Inter1
{  
    void say(String msg);    
}  
public class Functional_InterfaceEg1  implements Inter2
{  
    public void say(String msg)
    {  
        System.out.println(msg);  
    }  
    public static void main(String[] args) 
    {  
    	Functional_InterfaceEg1 fie = new Functional_InterfaceEg1();  
        fie.say("Hello there");  
        fie.message();  
    }  
}  
