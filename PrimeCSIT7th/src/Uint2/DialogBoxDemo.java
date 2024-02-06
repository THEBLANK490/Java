package Uint2;
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt
import java.awt.event.*;

//Its like a pop of box that is used to displaly error message, to take user
//input or to show normal message

class Dialog{
    public void setDialog(){
        JFrame f = new JFrame();
        //JOptionPane.showMessageDialog(f, "welcome");
        //warning message
        //JOptionPane.showInputDialog(f, "cannot close", "ERROR",JOptionPane.WARNING_MESSAGE);
        //to take input
        //JOptionPane.showInputDialog(f, "Enter Your number");
        
        //using JDialog
        JButton b1 = new JButton("Click me");
        JLabel l1 = new JLabel();
        f.add(b1);
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
        JDialog d1 = new JDialog(f,"dialog box");
        d1.setSize(200, 200);
        d1.add(new JLabel("Welcome to CSIT"));
        d1.setVisible(true);
        
    }
});
}}

public class DialogBoxDemo {
    public static void main(String[] args) {
        Dialog d = new Dialog();
        d.setDialog();
    }
    
}
