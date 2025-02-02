package eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DialogFrame extends JFrame {
	JButton b1,b2;
	JFrame fr;
	public DialogFrame() {
		fr= this;
		setLayout(new FlowLayout());
		b1= new JButton("Msg");
		b2= new JButton("Input");
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt) {
				
				JOptionPane.showMessageDialog(fr, "hello");
		    }
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent evt) {
				String s1= JOptionPane.showInputDialog(fr," ");
				JOptionPane.showMessageDialog(fr, "hello"+s1);   
			}
	});
		add(b1);
		add(b1);
		setSize(500,500);
    	setVisible(true);
     }
		
		  public static void main(String[] args) {
			  DialogFrame  fr= new  DialogFrame();
			  }
		}
		

