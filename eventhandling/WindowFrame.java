package eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WindowFrame extends JFrame implements WindowListener{
     public WindowFrame() {
    	 addWindowListener(this);
    	 setSize(500,500);
    	 setVisible(true);
     }
     public void WindowClosing(WindowEvent evt) {
    	 System.exit(0);
     }
     
 
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
    	
	  public static void main(String[] args) {
	     WindowFrame fr= new WindowFrame();
	  }
}
