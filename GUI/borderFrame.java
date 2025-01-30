
import java.awt.*;
import javax.swing.*;

 public class borderFrame extends JFrame
 {
    JButton b1,b2,b3,b4;
    JTextArea ta;
    JPanel p1;
    BorderLayout b;

    public borderFrame()
    {
        p1 = new JPanel();
        b = new BorderLayout();
        p1.setLayout(b);
        add(p1);
        b1= new JButton("Button1");
        b2= new JButton("Button2");
        b3= new JButton("Button3");
        b4= new JButton("Button4");
        ta= new JTextArea(7,8);
        p1.add("North",b1);
        p1.add("south",b2);
        p1.add("east",b3);
        p1.add("west",b4);
        p1.add("centre",ta);
        setSize(400,400);
        setVisible(true);  
    }
    public static void main(String[] args) {
        borderFrame fr=new borderFrame();
    }
    
}

       


    
 