package Uint2;
//border layout places the contetnt into 5 parts i.e. it divide whole 
//screen into 5 parts north,south,east,west,center and places the content 
//on such 5 parts
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt
import java.awt.event.*;

class Border extends JFrame{
    JButton b1,b2,b3,b4,b5;
    JTextArea t1;
    public void setBorder(){
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        b5 = new JButton("button5");
        t1 = new JTextArea(20,40);
        setVisible(true);
        setSize(400,400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(b1,BorderLayout.NORTH);//adding b1 to top
        add(b2,BorderLayout.SOUTH);//adding b2 to bottom
        add(b3,BorderLayout.WEST);//adding b3 to left
        add(b4,BorderLayout.EAST);//adding b4 to right
        add(t1,BorderLayout.CENTER);//adding t1 to middle
        //if b1 is pressed then showing content on text area
        b1.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e){
            t1.setText("North Button is Clicked");
        }
        });
        
        b2.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e){
            t1.setText("South Button is Clicked");
        } 
        });
        
        b3.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e){
            t1.setText("West Button is Clicked");
        } 
        });
        
        b4.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent e){
            t1.setText("East Button is Clicked");
        } 
        });
        
        
    }
}
public class BorderLayoutDemo {
    public static void main(String[] args) {
        Border b = new Border();
        b.setBorder();
    }
}
