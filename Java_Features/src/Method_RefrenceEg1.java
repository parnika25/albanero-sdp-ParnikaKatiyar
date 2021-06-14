public class Method_RefrenceEg1 
{ 
    public void printn()
    {  
        System.out.println("Hello, this is instance method");  
    }  
    public static void main(String[] args) 
    {  
    Thread t2=new Thread(new Method_RefrenceEg1 ()::printn);  
        t2.start();       
    }  
}