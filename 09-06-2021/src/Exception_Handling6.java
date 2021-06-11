// Checked Exception Handling
import java.io.FileNotFoundException;  
import java.io.PrintWriter;  
  
public class Exception_Handling6
{  
    public static void main(String[] args) throws Exception
    	{    
    	try {
        	PrintWriter pw;  
            pw = new PrintWriter("jtp.txt");
            pw.println("saved");  
            System.out.println("File saved successfully"); 
            int a=50/0;
    	} 
    catch(Exception e)
    {
    	System.out.println(e);
    }
} 
}