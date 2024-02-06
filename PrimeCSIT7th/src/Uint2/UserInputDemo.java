package Uint2;
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt
import java.awt.event.*;//event listerner ko lagi 

class Userinput extends JFrame{
        JLabel l1,l2,l3;
        JTextField t1,t2;
        JButton b1,b2;
    public void setInput(){
        l1 = new JLabel("Enter first number");
        l2 = new JLabel("Enter Second number");
        l3 = new JLabel("Result");
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        //adding component into window
        add(l1);add(t1);
        add(l2);add(t2);
        add(b1);add(b2);add(l3);        
        //setting window
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Handling event generated from button
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //extracting data of t1 and t2
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int sum = num1 + num2;
                l3.setText("Sum is: "+ sum);
                
            }
        });
        //for subtract
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //extracting data of t1 and t2
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int diff = num1 - num2;
                l3.setText("Difference is: "+ diff);
            }
        });
    }
}
public class UserInputDemo {
    public static void main(String[] args) {
        Userinput u1 = new Userinput();
        u1.setInput();
    }
    
}
