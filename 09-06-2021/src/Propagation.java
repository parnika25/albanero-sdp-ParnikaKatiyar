public class Propagation
{  
  void m() 
  {  
    throw new java.io.IOException("device error");
  }  
  void n()
  {  
    m();  
  }  
  void p()
  {  
   try
   {  
    n();  
   }
   catch(Exception e)
   {
	   System.out.println("exception handeled");
   }  
  }  
  public static void main(String args[])
  {  
   Propagation obj=new Propagation();  
   obj.p();  
   System.out.println("normal flow");  
  }  
}  

// Checked Exceptions are not forwarded in calling chain (propagated).