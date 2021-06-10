public class Start_Thread_Twice extends Thread
{  
	 public void run()
	 {  
	   System.out.println("running...");  
	 }  
	 public static void main(String args[]) throws Exception
	 {  
		 Start_Thread_Twice t1=new Start_Thread_Twice();  
		 try 
		 {
		 t1.start();  
		 t1.start();
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	 }  
}