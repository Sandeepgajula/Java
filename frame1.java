package Frames;
import java.awt.*;
public class frame1 {
    public static void main(String[] args) {
        Frame f=new Frame("Frame1");
        f.setLayout(new FlowLayout()); 
        Label l=new Label("name");
        
        TextField tf= new TextField(20);
        Button b=new Button("SUBMIT");
        
        f.add(l);
        f.add(tf);
        f.add(b);
        f.setSize(300,400);
        f.setVisible(true);
     }
    
}
