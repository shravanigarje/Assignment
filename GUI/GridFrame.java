import javax.swing.*;
import java.awt.*;

public class GridFrame extends JFrame {
    GridLayout g;
    JButton b1,b2,b3,b4;
    public GridFrame(){
        g=new GridLayout(2,2,10,10);
        setLayout(g);
        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setSize(500,500);
        setVisible(true);  
    }
    public static void main(String[] args) {
        GridFrame fr=new GridFrame();
    }
    
}
