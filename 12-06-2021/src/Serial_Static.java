import java.io.*;
class Person2 implements Serializable
{
	 int id;  
	 String name;  
	 public Person2(int id, String name) 
	 {  
	  this.id = id;  
	  this.name = name;  
	 } 
}
class Student2 extends Person2
{  
	String course;  
	static int fee = 50000;  
 public Student2(int id, String name,String course) 
 {  
	 super(id,name);
	  this.course = course;  
	  this.fee = fee;  
 }  
} 
public class Serial_Static
{  
 public static void main(String args[])
 {  
  try
  {    
  Student2 s1 =new Student2(111,"Krish","CSE");  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  out.writeObject(s1);  
  out.flush();   
  out.close();  
  System.out.println("Successfully completed");  
  }
  catch(Exception e)
  {
	  System.out.println(e);
	  }  
 }  
} 