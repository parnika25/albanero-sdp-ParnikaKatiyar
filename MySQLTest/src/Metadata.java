import java.sql.*;  
class Metadata
{ 
  public static void main(String args[])
  {  
	try
	{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection("jdbc:mysql:///feedback","root","Passsword");  
			DatabaseMetaData db=con.getMetaData();  
			  
			System.out.println("Driver Name: "+db.getDriverName());  
			System.out.println("Driver Version: "+db.getDriverVersion());  
			System.out.println("UserName: "+db.getUserName());  
			System.out.println("Database Product Name: "+db.getDatabaseProductName());  
			System.out.println("Database Product Version: "+db.getDatabaseProductVersion());  
			con.close();  
	}
	catch(Exception e)
	{
		System.out.println(e);
	}  
  }  
}  