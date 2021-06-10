//Java Thread Example by extending Thread class
public class Run_Thread extends Thread
{
	public void run()
	{
		System.out.println("Thread is running;");
	}
	public static void main(String[]args)
	{
		Run_Thread t = new Run_Thread();
		t.start();
	}
}
