package gui;
import javax.swing.*;

public class StudRegistration extends JFrame {

	  JPanel p1;
	  JLabel l1,l2,l3,l4,l5;
	  JTextField t1;
	  JTextArea ta;
	  JComboBox cb;
	  JButton b1,b2;
	  JCheckBox c1,c2,c3;
	  JRadioButton rb1,rb2;
	  ButtonGroup bg;

	  public  StudRegistration ()
	  {
	    super("Student registration Form");
	    p1=new JPanel();
	    l1=new JLabel("Enter your name:");
	    l1=new JLabel("Enter your Address:");
	    l1=new JLabel("Qualification:");
	    l1=new JLabel("Subjects:");
	    l1=new JLabel("Gender:");
	    b1=new JButton("Submit");
	    b2=new JButton("Cancel");
	    t1=new JTextField(30);
	    ta=new JTextArea(8,9);
	    String s1[]= {"BE","BCS","MCS","ME"};
	    cb=new JComboBox(s1);
	    c1=new JCheckBox("C");
	    c2=new JCheckBox("Python");
	    c3=new JCheckBox("Java");
	    rb1=new JRadioButton("Male");
	    rb2=new JRadioButton("Female");
	    bg=new ButtonGroup();
	    bg.add(rb1);
	    bg.add(rb2);
	    add(p1);
	    p1.add(l1);
	    p1.add(t1);
	    p1.add(l2);
	    p1.add(ta);
	    p1.add(l3);
	    p1.add(cb);
	    p1.add(l4);
	    p1.add(c1);
	    p1.add(c2);
	    p1.add(c3);
	    p1.add(l5);
	    p1.add(rb1);
	    p1.add(rb2);
	    p1.add(b1);
	    p1.add(b2);
	    setSize(500,500);
	    setVisible(true);
	  }
	  public static void main(String[] args)
	  {
		  StudRegistration  fr= new StudRegistration ();
	  }
	}
