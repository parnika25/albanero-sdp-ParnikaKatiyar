class Name_ID extends Thread
{  
  public void run()
  {  
   System.out.println("Running...");  
  }  
 public static void main(String args[])
 {  
   	 Name_ID t1=new Name_ID();  
	 Name_ID t2=new Name_ID();  
	  System.out.println("Name of t1:"+t1.getName());  
	  System.out.println("Name of t2:"+t2.getName());  
	  System.out.println("ID of t1:"+t1.getId());  
	  System.out.println("ID of t2:"+t2.getId());
	  
	  t1.start();  
	  t2.start();  
	  
	  t1.setName("Sonoo Jaiswal");  
	  System.out.println("After changing name of t1:"+t1.getName());  
	 }  
}