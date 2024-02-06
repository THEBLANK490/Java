
package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class KeyEventExample extends JFrame{
    JTextField t1;
    JLabel l1;
    public void setKeyEvent(){
        t1=new JTextField(15);
        l1 = new JLabel("result");
        t1.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                //when key id typed
                l1.setText("Keyy Typed");
            }
            @Override
            public void keyPressed(KeyEvent e) {
                //when key is pressed
                l1.setText("Keyy Pressed");
            }
            @Override
            public void keyReleased(KeyEvent e) {
                //when key is released
                l1.setText("Keyy Released");
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

public class KeyEventDemo {
    public static void main(String[] args) {
        KeyEventExample k = new KeyEventExample();
        k.setKeyEvent();
    }
}
