public class Nested_Try
{  
 public static void main(String args[])
 {  
  try
  {  
    try
    {  
     int b =39/0;  
    }
    catch(ArithmeticException e)
    {
    	System.out.println(e);
    }  
    try
    {  
    int a[]=new int[5];  
    a[5]=4;  
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
    	System.out.println(e);
    }  
    int b[]=new int[10];
    b[10]=10;
  }
  catch(Exception e)
  {
	  System.out.println("Handeled");
  }  
  
  System.out.println("normal flow..");  
 }  
}