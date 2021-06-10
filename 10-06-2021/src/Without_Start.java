class Without_Start extends Thread
{  
 public void run()
 {  
  for(int i=1;i<=5;i++)
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
 public static void main(String args[]){  
	 Without_Start t1=new Without_Start();  
	 Without_Start t2=new Without_Start();  
   
  t1.run();  
  t2.run();  
 }  
}  
//there is no context-switching because here t1 and t2 will be treated as normal object not thread object.