package gui;
import javax.swing.*;
public class MenuFrame extends JFrame {
  JMenuBar mb;
  JMenu f1,e1;
  JMenuItem n1,o1,s1,c1,ci,p1;
  
  public MenuFrame() {
	  mb=new JMenuBar();
	  setJMenuBar(mb);
	  f1=new JMenu("File");
	  e1=new JMenu("Edit");
	  mb.add(f1);
	  mb.add(e1);
	  n1=new JMenuItem("New");
	  o1=new JMenuItem("Open");
	  s1=new JMenuItem("Save");
	  c1=new JMenuItem("Cut");
	  ci=new JMenuItem("Copy");
	  p1=new JMenuItem("Paste");
	  
	  f1.add(n1);
	  f1.add(o1);
	  f1.add(s1);
	  e1.add(c1);
	  e1.add(ci);
	  e1.add(p1);
	  
	  setSize(500,500);
	  setVisible(true);
  }
	  public static void main(String[] args) {
		  MenuFrame fr=new MenuFrame();
	  }
	  
}
