package gui;
import java.awt.*;
import javax.swing.*;

public class LoginFrame extends JFrame{
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    public LoginFrame() {
    	setLayout(null);
    	l1= new JLabel("enter username");
    	l2= new JLabel("enter Password");
    	t1= new JTextField(30);
    	t2= new JPasswordField(30);
    	b1= new JButton("Login");
    	b2= new JButton("Cancel");
    	l1.setBounds(100,100,120,50);
    
    	t1.setBounds (240,100,120,50);
    	l2.setBounds(100,170,120,50);
    	t2.setBounds(240,170,120,50);
    	b1.setBounds(150,240,70,50);
    	b2.setBounds(240,240,70,50);
    	add(l1);
    	add(t1);
    	add(l2);
    	add(t2);
    	add(b1);
    	add(b2); 
     
    	setSize(500,500);
    	setVisible(true);
    	
    }
        public static void main(String [] args)
{
        	LoginFrame fr= new LoginFrame();
}
}
