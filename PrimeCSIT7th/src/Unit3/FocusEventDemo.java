//generated when the component loses or gain focus of keyboard 
package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Focus extends JFrame{
    JLabel l1;
    JButton b1;
    JButton b2;
    public void setFocus(){
        l1 = new JLabel("result");
        b1 = new JButton("submit");
        b2 = new JButton("reset");
        add(l1);add(b1);add(b2);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  System.out.println("Button gained Focus");
                  l1.setText("Button gained Focus");
            }

            @Override
            public void focusLost(FocusEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                  System.out.println("Button loses Focus");
                  l1.setText("Button loses Focus");
            }
            
        });
        
        
    }
}
public class FocusEventDemo {
    public static void main(String[] args) {
        Focus f = new Focus();
        f.setFocus();
    }
}
