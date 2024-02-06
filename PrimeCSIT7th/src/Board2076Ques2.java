import javax.swing.*;//swing component
import java.awt.*;//awt compontnt
import java.awt.event.*;

class Ques2 extends JFrame{

    JTextField t1, t2, t3;
    JLabel l1, l2, l3;

    public void setQues2() {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        l1 = new JLabel("First number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel("Result");
        t3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                t3.setText("" + (num2+num2));
            }
        });
        
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

public class Board2076Ques2 {
    public static void main(String[] args) {
         Ques2 q2 = new Ques2();
         q2.setQues2();
    }
}
