package Uint2;
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt

//gridlayout shows the cocntent in form of rectangular grid with row and cocl 
// i.e 3*3 means content will be placed in 3 row and 3 column
class Grid extends JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    public void setGrid(){
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        b5 = new JButton("button5");
        b6 = new JButton("button6");
        add(b1);add(b2);add(b3);
        add(b4);add(b5);add(b6);
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(3,2,5,5));//2 row and each row has 2 col
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
public class GridLayoutDemo {
    public static void main(String[] args) {
        Grid g = new Grid();
        g.setGrid();
        
    }
}
