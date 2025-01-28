package gui;
import javax.swing.*;
public class MyFrame extends JFrame{
	JButton b1,b2,b3;
	JPanel P1;
	public MyFrame()
	{
		super("My Frame");
		b1=new JButton("Button1");
		b2=new JButton("Button2");
		b3=new JButton("Button3");
		P1=new JPanel ();
		add(P1);
		P1.add(b1);
		P1.add(b2);
		P1.add(b3);
		setSize(500,500);
		setVisible(true);
		
	}
	 public static void main(String[] args) {
		 MyFrame fr=new MyFrame();
	 }
}
