//Using deleagtion event (using listener interface) we have to implement all the methods but using adapter
//class we can only particular method of event
package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseAdapters extends JFrame {

    JTextField t1, t2;
    JLabel l1;

    public void setMouseAdapter() {
        t1 = new JTextField(40);
        t2 = new JTextField(40);
        l1 = new JLabel("result");

        //using mouseAdapter calss to handle mouse event
        //mouseListerener use garuo vane sabbai override funxtion use garnu oarney hunxa
        t1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("mouse Clicked");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                l1.setText("mouse enteredt into component");
            }
        });

        t2.addMouseMotionListener(new MouseMotionAdapter() {
            //moiton listeneer contain 2 method but we can any of them
            @Override
            public void mouseDragged(MouseEvent e){
                l1.setText("mouse dragged");
            }
        });

        add(t1);
        add(t2);
        add(l1);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }
}

public class MouseAdapterDemo {

    public static void main(String[] args) {
        MouseAdapters m1 = new MouseAdapters();
        m1.setMouseAdapter();
    }
}