package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowExample{
    JFrame jf;
    public void setWindows(){
        jf = new JFrame();
        jf.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  System.out.println("Window open");
            }

            @Override
            public void windowClosing(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  System.out.println("Window closing using cross sign");
            }

            @Override
            public void windowClosed(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  System.out.println("Window closed.Not active");
            }

            @Override
            public void windowIconified(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  System.out.println("Window minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  System.out.println("Window activated from minimzed");
            }

            @Override
            public void windowActivated(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  System.out.println("Window is active");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  System.out.println("Window deactivated");
            }
            
        });
        jf.setLayout(new FlowLayout());
        jf.setSize(200,200);
        jf.setDefaultCloseOperation(3);
        jf.setVisible(true);
        
    }
}
public class WindowsEventDemo {
        public static void main(String[] args) {
        WindowExample w = new WindowExample();
        w.setWindows();
    }
}
