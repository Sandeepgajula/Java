import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.*;  
import java.sql.*;  

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingTester {
   public static void main(String[] args) {
      createWindow();
   }

   private static void createWindow() {    
      JFrame frame = new JFrame("Swing Tester");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      createUI(frame);
      frame.setSize(560, 200);      
      frame.setLocationRelativeTo(null);  
      frame.setVisible(true);
   }

   private static void createUI(final JFrame frame){  
      JPanel panel = new JPanel();
      LayoutManager layout = new FlowLayout();  
      panel.setLayout(layout);       

      JButton button = new JButton("Click Me!");
      final JLabel label = new JLabel();

      button.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(frame);
            if(option == JFileChooser.APPROVE_OPTION){
               File file = fileChooser.getSelectedFile();
               label.setText("File Selected: " + file.getName());
                 String str=file.getName();
try{  

     String url="jdbc:mysql://localhost:3306/oop";
     String name="root";
     String pass="password";

          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,name,pass);
              
PreparedStatement ps=con.prepareStatement(  
"insert into fil values(?)");  
              
File f=new File("/home/surender/Desktop/"+str);  
FileReader fr=new FileReader(f);  
   
ps.setCharacterStream(1,fr,(int)f.length());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
              
con.close();  
              
}catch (Exception ex) {ex.printStackTrace();}   
            }else{
               label.setText("Open command canceled");
            }
         }
      });

      panel.add(button);
      panel.add(label);
      frame.getContentPane().add(panel, BorderLayout.CENTER);    
   }  
} 
