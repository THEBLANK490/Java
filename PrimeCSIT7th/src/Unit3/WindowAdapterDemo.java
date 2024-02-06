//using window Adapter we can user only required method of window event 
//i.e.we donot have to implement all to method of window event
package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowsAdapter{
    JFrame jf;
    public void setWindows(){
        jf=new JFrame();
        jf.addWindowListener(new WindowAdapter(){
            @Override
            public void windowIconified(WindowEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                //when window is opened and working state
                System.out.println("window minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//            attempt to close the window using menu
                System.out.println("window maximized");
            }
        });
        jf.setLayout(new FlowLayout());
        jf.setSize(200,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class WindowAdapterDemo {
    public static void main(String[] args) {
        
        WindowsAdapter w = new WindowsAdapter();
        w.setWindows();
    }
}