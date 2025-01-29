
import javax.swing.*;
import java.awt.*;
    
public class flowLayout extends JFrame{
    FlowLayout f;
    JButton b1,b2,b3;
    public flowLayout ()
    {
        f=new FlowLayout(FlowLayout.LEFT);
        setLayout(f);
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        add(b1);
        add(b2);
        add(b3);
        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args){
        flowLayout fr=new flowLayout();
    }
}

