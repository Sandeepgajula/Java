package Frames;
import java.awt.*; 
import java.awt.event.*; 
class lay extends Frame {
    Button b1,b2,b3,b4;
    public lay(){
        super("flowlayout demo"); 
        b1=new Button ("Click1");
        b2=new Button ("Click2");
        b3=new Button ("Click3");
        b4=new Button ("Click4");
       /*  FlowLayout f1=new FlowLayout();
        f1.setAlignment(FlowLayout.RIGHT);
        setLayout(f1);*/
        add(b1,BorderLayout.CENTER);
        add(b2);
        add(b3);
        add(b4);
        
    }

   



}
public class layout {
    public static void main(String[] args) {
        lay m=new lay();
        m.setVisible(true);
        m.setSize(400,400);
    }
     
    
}
  
