class Priority extends Thread
{  
 public void run()
 {  
   System.out.println("Running thread name is : "+Thread.currentThread().getName());  
   System.out.println("Running thread priority is : "+Thread.currentThread().getPriority());  
  
  }  
 public static void main(String args[])
 {  
  Priority t1=new Priority();  
  Priority t2=new Priority();
  Priority t3=new Priority();
  t1.setPriority(Thread.MIN_PRIORITY);  
  t2.setPriority(Thread.MAX_PRIORITY);
  t3.setPriority(Thread.NORM_PRIORITY);
  t1.start();  
  t2.start();
  t3.start();
   
 }  
}