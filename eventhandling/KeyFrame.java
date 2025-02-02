package eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyFrame extends JFrame implements KeyListener {
	String s1;
	public KeyFrame() {
		s1="";
		addKeyListener(this);
		setSize(500,500);
		setVisible(true);
	}
	public void KeyTyped(KeyEvent evt) {
		s1= s1+evt.getKeyChar();
		repaint();
	}
	public void paint(Graphics g) {
	
		g.drawString(s1, 10, 50);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	  public static void main(String[] args) {
		   KeyFrame fr= new KeyFrame();
		  }
	
	

}
