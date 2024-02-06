package Uint2;
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt
import java.awt.event.*;
//card layout places the content as a sequence of card i.e only one componenet is visible at one time.
class Card extends JFrame{
    JButton b1,b2,b3,b4;
    JPanel p1;
        public void setGridBag(){
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        p1 = new JPanel();
        CardLayout c1 = new CardLayout();
        p1.setLayout(c1);
        //adding component to panel
        p1.add(b1,"button 1");
        p1.add(b2,"button 2");
        p1.add(b3,"button 3");
        p1.add(b4,"button 4");
        add(p1);//adding panel to Jframe
        
        //showing next component
       // c1.next(p1);
        
        //showing previous component
        //c1.previous(p1);
        
        //showing component of own choices
        //c1.show(p1,"but1");
        
        //showing each component when button is clicked
        b1.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            c1.previous(p1);
        }
        });
                
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
public class CardLayoutDemo {
     public static void main(String[] args) {
        Card c = new Card();
        c.setGridBag();
    }
}
