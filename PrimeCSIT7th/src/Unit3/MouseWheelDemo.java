package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MouseWheel extends JFrame{
    JTextField t1;
    JLabel l1;
    public void setMouseWheel(){
        t1=new JTextField(15);
        l1 = new JLabel("result");
        t1.addMouseWheelListener(new MouseWheelListener(){
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("mouse wheel moved");
            }
       
    
            });
        add(t1);
        add(l1);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
public class MouseWheelDemo {
    public static void main(String[] args) {
        MouseWheel m = new MouseWheel();
        m.setMouseWheel();
    }
}