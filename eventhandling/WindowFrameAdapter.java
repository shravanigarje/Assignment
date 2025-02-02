package eventhandling;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WindowFrameAdapter extends JFrame {
     public WindowFrameAdapter() {
    	 
    	 
    	 addWindowListener(new WindowClass());
    	 setSize(500,500);
    	 setVisible(true);
     }
     
     class WindowClass extends WindowAdapter{
    	 public void WindowClosing(WindowEvent evt) {
        	 System.exit(0);
    	 }       	 
     }
	  public static void main(String[] args) {
	     WindowFrameAdapter fr= new WindowFrameAdapter();
	  }
}
