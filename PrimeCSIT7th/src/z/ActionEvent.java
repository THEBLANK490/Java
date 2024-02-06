package z;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionEventDemo extends JFrame {

    JLabel l1;
    JButton b1;

    public void setActionEvent() {
        l1 = new JLabel();
        b1 = new JButton("Click Me");

        add(b1);
        add(l1);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                //extracting data of t1 and t2
                l1.setText("Button clicked");

            }
        });
    }
}

public class ActionEvent {

    public static void main(String[] args) {
        ActionEventDemo a = new ActionEventDemo();
        a.setActionEvent();
    }
}
