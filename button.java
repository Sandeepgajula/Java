package Frames;
import java.awt.*; 
import java.awt.event.*; 
class Myframe extends Frame implements ActionListener{
    int count=0;
    Label l;
    Button b;
    public Myframe(){
        super("buttom demo");
        l=new Label(" "+count);
        b=new Button ("Click");
        b.addActionListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        count++;
        l.setText(" "+count);
        
    }



}
public class button {
    public static void main(String[] args) {
        Myframe m=new Myframe();
        m.setVisible(true);
        m.setSize(400,400);
    }
     
    
}
  