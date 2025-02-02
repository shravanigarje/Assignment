package gui
import java.awt.*;
import javax.swing.*;
public class CalculatorFrame {
    JPanel p1;
    JTextField t1;
    JButton b1[];
    GridLayout g;
    public CalculatorFrame(){
        g= new GridLayout(4,4,10,10);
        p1= new JPanel();
        p1.setLayout(null);
        t1= new JTextField(30);
        p1.add("North",t1);
        p1.add("Centre",p1);
        b1= new JButton[16];
        for(int i=0;i<10;i++){
            b1[i]= new JButton(""+i);
        }
        b1[10]= new JButton(".");
        b1[11]= new JButton("=");
        b1[12]= new JButton("+");
        b1[13]= new JButton("-");
        b1[14]= new JButton("*");
        b1[15]= new JButton("/");
        for(int i=0;i<10;i++){
            p1.add(b1[i]);
        }
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args)
{
    CalculatorFrame fr = new  CalculatorFrame();
}}
