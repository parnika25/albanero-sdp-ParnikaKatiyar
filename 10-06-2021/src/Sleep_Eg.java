class Sleep_Eg extends Thread
{  
 public void run()
 {  
  for(int i=1;i<5;i++)
  {  
    try
    {
    	Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
    	System.out.println(e);
    }  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[])
 {  
	 Sleep_Eg t1=new Sleep_Eg();  
	 Sleep_Eg t2=new Sleep_Eg();
	 Sleep_Eg t3=new Sleep_Eg();
   
  t1.start();  
  t2.start();  
  t3.start();
 }  
} 