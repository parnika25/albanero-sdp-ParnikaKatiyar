public class Current_Thread extends Thread
{  
 public void run()
 {  
  System.out.println(Thread.currentThread().getName()); 
  System.out.println(Thread.currentThread().getId());
 }  
  
 public static void main(String args[])
		 {  
	 Current_Thread t1=new Current_Thread();  
	 Current_Thread t2=new Current_Thread();  
  
  t1.start();  
  t2.start();  
 }  
} 