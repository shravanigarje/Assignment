package eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class colorFrame extends JFrame implements ActionListener{
         JButton b1,b2,b3;
         public colorFrame() {
        	 setLayout(new FlowLayout());
        	 b1= new JButton("Red");
        	 b2= new JButton("Pink");
        	 b3= new JButton("Black");
        	 b1.addActionListener(this);
        	 b2.addActionListener(this);
        	 b3.addActionListener(this);
        	  add(b1);
        	  add(b2);
        	  add(b3);
        	  
        	  setSize(500,500);
        	  setVisible(true);
        	 
         }
         public void actionPerformed(ActionEvent evt) {
        	 Object obj= evt.getSource();
        	 if(obj==b1)
        		 getContentPane().setBackground(Color.red);
        	 else if(obj==b2)
        		 getContentPane().setBackground(Color.pink);
        	 else if(obj==b3)
        		 getContentPane().setBackground(Color.black);
        	 
         }
         public static void main(String[] args) {
        	 colorFrame fr= new colorFrame();
        
         }
	
}
