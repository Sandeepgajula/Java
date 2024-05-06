import java.io.*;  
import java.sql.*;  
  
public class StoreFile {  
public static void main(String[] args) {  
try{  

     String url="jdbc:mysql://localhost:3306/oop";
     String name="root";
     String pass="password";

          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,name,pass);
              
PreparedStatement ps=con.prepareStatement(  
"insert into fil values(?)");  
              
File f=new File("/home/surender/Desktop/file.txt");  
FileReader fr=new FileReader(f);  
   
ps.setCharacterStream(1,fr,(int)f.length());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
              
con.close();  
              
}catch (Exception e) {e.printStackTrace();}  
}  
}  
