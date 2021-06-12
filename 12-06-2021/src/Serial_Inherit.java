import java.io.*;
class Person implements Serializable
{
	 int id;  
	 String name;  
	 public Person(int id, String name) 
	 {  
	  this.id = id;  
	  this.name = name;  
	 } 
}
class Student1 extends Person
{  
	String course;  
	 int fee;  
 public Student1(int id, String name,String course ,int fee) 
 {  
	 super(id,name);
	  this.course = course;  
	  this.fee = fee;  
 }  
} 
public class Serial_Inherit
{  
 public static void main(String args[])
 {  
  try
  {    
  Student1 s1 =new Student1(111,"Krish","CSE",50000);  
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