interface Interface
{   
    int add(int a, int b);    
    default int sub(int a, int b)
    {    
        return a-b;    
    }    
    static int multiply(int a, int b)
    {    
        return a*b;    
    }    
}    
public class Default_Static implements Interface
{    
    public int add(int a, int b)
    {          
        return a+b;    
    }    
    public static void main(String[] args) 
    {    
    	Default_Static a = new Default_Static();    
        int result1 = a.add(20, 10);    
        int result2 = a.sub(20, 10);    
        int result3 = Interface.multiply(20, 10);   
        System.out.println("Addition: "+result1);    
        System.out.println("Substraction: "+result2);    
        System.out.println("Multiplication: "+result3);    
    }    
}