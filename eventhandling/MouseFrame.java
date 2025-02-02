package eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseFrame extends JFrame implements MouseListener{

    int x,y;
    public MouseFrame() {
    	addMouseListener(this);
    	setSize(500,500);
    	setVisible(true);
    }
	@Override
	public void mouseClicked(MouseEvent evt) {
		// TODO Auto-generated method stub
		
		x= evt.getX();
		y= evt.getY();
		repaint();
	}
	public void paint(Graphics g) {
		String s1="X="+x+"Y="+y;
		g.drawString(s1, x, y);
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	  public static void main(String[] args) {
		     MouseFrame fr= new MouseFrame();
		  }
	
	
}
