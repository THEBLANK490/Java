
package Unit3;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
class MouseMotion extends JFrame{
    JLabel l1;
    JTextField t1;
    public void setMouseMotion(){
        l1 = new JLabel("Result");
        t1 = new JTextField(15);
        t1.addMouseMotionListener(new MouseMotionListener(){
            @Override 
            public void mouseDragged(MouseEvent e){
                l1.setText("mouse dragged at"+e.getX()+","+e.getY());
            }
             @Override 
            public void mouseMoved(MouseEvent e){
                l1.setText("mouse mmoved");
            }
        });
         add(l1);
        add(t1);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class MouseMotionEventDemo {
    public static void main(String[] args) {
           MouseMotion m = new MouseMotion();
           m.setMouseMotion();
    }
}
