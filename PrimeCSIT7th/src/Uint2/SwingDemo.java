package Uint2;
import javax.swing.*;
import java.awt.*;

class SwingComponent extends JFrame{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField t2,t3;
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3;
    JButton b1;
    public void setComponent(){
        //creating objects of JLabel
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l3 = new JLabel("Repassword");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Course");
        
        //creating objects for textfield
        t1 = new JTextField(15);
        t2 = new JPasswordField(15);
        t3 = new JPasswordField(15);
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        c1 = new JCheckBox("C");
        c2 = new JCheckBox("C++");
        c3 = new JCheckBox("Java");
        b1 = new JButton("Submit");
        
        //creating group for radio button
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        
        //adding components into JFrame
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(l4);add(r1);add(r2);
        add(l5);add(c1);add(c2);add(c3);
        add(b1);
        
        //adding features of window
        setLayout(new FlowLayout());
        setVisible(true); //dispalying window
        
        //if cancel button is pressed then program iwll end
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,500); //setting the size of window
    }
}
public class SwingDemo {
    public static void main(String[] args) {
        SwingComponent sc = new SwingComponent();
        sc.setComponent();
    }
}
