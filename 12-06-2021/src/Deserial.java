import java.io.*;  
class Deserial
{  
 public static void main(String args[])
 {  
  try
  {  
	  FileInputStream fin = new FileInputStream("f.txt");
	  ObjectInputStream in=new ObjectInputStream(fin);  
	  Student s=(Student)in.readObject();  
	  System.out.println(s.id+" "+s.name);  
	  in.close();  
  }
  catch(Exception e)
  {
	  System.out.println(e);
  }  
 }  
}  