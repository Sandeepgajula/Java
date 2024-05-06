package Frames;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream; 
class My extends JFrame implements ActionListener{
     JToolBar tb;
     JButton b1,b2,b3;
     JTextArea ta;
    public My(){
        super("Tool Bar ");
        tb=new JToolBar();
        b1=new JButton ("Home");
        b2=new JButton(new ImageIcon("C:/Users/sandeep gajula/Pictures/index.jpg"));
        b3=new JButton(new ImageIcon("C:/Users/sandeep gajula/Pictures/sandy.jpg"));
        tb.add(b1);tb.add(b2);tb.add(b3);
        tb.add(new JToolBar.Separator());
        ta=new JTextArea();
        JScrollPane p=new JScrollPane(ta);
        add(tb,BorderLayout.NORTH); 
        JMenuBar mb=new JMenuBar();
        JMenu f=new JMenu("File");
        JMenuItem m1=new JMenuItem("save");
        JMenuItem m2=new JMenuItem("open");
        f.add(m1);
        f.addSeparator();
        f.add(m2);
        mb.add(f);
        setJMenuBar(mb);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JFileChooser f=new JFileChooser();
        f.showOpenDialog(this);
        File fc=f.getSelectedFile();
        try{
            FileInputStream f3=new FileInputStream(fc);
            byte b[]=new byte[f3.available()];
            f3.read(b);
            String str=new String(b);
            ta.setText(str);
            f3.close();
        }
        catch(Exception y){ }
       
        
        
    }



}
public class swing2 {
    public static void main(String[] args) {
        My m=new My();
        m.setVisible(true);
        m.setSize(400,400);
    }
     
    
}
  
