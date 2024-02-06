import javax.swing.*;//swing component
import java.awt.*;//awt compontnt
import java.awt.event.*;

class Ques1 extends JFrame{
    JTextField t1, t2, t3;
    JLabel l1,l2,l3;
    public void setQues1(){
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        l1 = new JLabel("enter first number:");
        l2 = new JLabel("enter second number:");
        l3 = new JLabel("Result");
        
        l3.addMouseListener(new MouseAdapter(){
        @Override
        public void mousePressed(MouseEvent e){
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            l3.setText("sum is "+ (num1 + num2));
        }
        
        @Override
        public void mouseReleased(MouseEvent e){
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            l3.setText("difference is "+ (num1 - num2));
        }
        });
        
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Board2078Ques1 {
    public static void main(String[] args) {
         Ques1 q1 = new Ques1();
         q1.setQues1();
    }
}
