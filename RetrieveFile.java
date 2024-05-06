import java.io.*;  
import java.sql.*;  
  
public class RetrieveFile {  
public static void main(String[] args) {  
try{  
     String url="jdbc:mysql://localhost:3306/oop";
     String name="root";
     String pass="password";

         // Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,name,pass); 
              
PreparedStatement ps=con.prepareStatement("select * from fil");  
ResultSet rs=ps.executeQuery();  
rs.next();//now on 1st row  
              
Clob c=rs.getClob(1);  
Reader r=c.getCharacterStream();              
              
FileWriter fw=new FileWriter("C:/Users/sandeep gajula/Desktop/E3S1/java/Example1.txt");  
              
int i;  
while((i=r.read())!=-1)  
fw.write((char)i);  
              
fw.close();  
con.close();  
              
System.out.println("success");  
}catch (Exception e) {e.printStackTrace();  }  
}  
}  
