package z;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JFrameDemo extends JFrame{
    public void JFrameMethod(){
        ImageIcon image = new ImageIcon(Jframe.class.getResource("/image/logo.png"));
        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(-5);
        label.setBackground(Color.black);
        label.setOpaque(true);
        
        
        add(label);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setTitle("JFrameDemo");
//        getContentPane().setBackground(new Color(123,50,250));
    }
}

public class Jframe {
    public static void main(String[] args) {
        JFrameDemo j = new JFrameDemo();
        j.JFrameMethod();
    }
}
