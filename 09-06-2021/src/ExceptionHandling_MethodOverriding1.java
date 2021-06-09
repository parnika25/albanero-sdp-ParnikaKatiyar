// If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
import java.io.*;  
class Parent1
{  
  void msg(){System.out.println("parent");}  
}  
  
class ExceptionHandling_MethodOverriding1 extends Parent1
{  
  void msg()throws IOException
  {  
    System.out.println("TestExceptionChild");  
  }  

	  public static void main(String args[])
	  {  
		  Parent1 p=new ExceptionHandling_MethodOverriding1();  
		  p.msg();  
  }
}	  

