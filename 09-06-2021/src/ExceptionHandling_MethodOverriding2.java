//If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.import java.io.*;  
class Parent2
{  
  void msg(){System.out.println("parent");}  
}  
  
class ExceptionHandling_MethodOverriding2 extends Parent2
{  
  void msg()throws ArithmeticException
  {  
    System.out.println("TestExceptionChild");  
  }  

	  public static void main(String args[])
	  {  
		  Parent2 p=new ExceptionHandling_MethodOverriding2();  
		  p.msg();  
  }
}	  

