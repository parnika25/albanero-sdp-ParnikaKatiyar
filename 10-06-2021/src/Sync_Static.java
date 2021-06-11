class Table3
{  
synchronized static void printTable(int n)		//synchronized method
 {  
	   for(int i=1;i<=10;i++)
	   {  
	     System.out.println(n*i);  
	     try
	     {  
	      Thread.sleep(400);  
	     }
	     catch(Exception e)
	     {
	    	 System.out.println(e);
	     }  
	   	} 
 }  
}  
  
class Thread11 extends Thread
{  

	public void run()
	{  
		Table3.printTable(5);  
	}  
  
}  
class Thread22 extends Thread
{    
	public void run()
	{  
		Table3.printTable(10);  
	}  
}  
  
public class Sync_Static
{  
	public static void main(String args[])
	{   
		Thread11 t1=new Thread11();  
		Thread22 t2=new Thread22();  
		t1.start();  
		t2.start();  
	}  
}