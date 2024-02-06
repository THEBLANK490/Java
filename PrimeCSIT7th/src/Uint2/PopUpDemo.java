package Uint2;
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt

class PopUp extends JFrame{
    public void setPop(){
        JPopupMenu p1 = new JPopupMenu();
        
        JMenuItem i1 = new JMenuItem("View");
        JMenuItem i2 = new JMenuItem("Refresh");
        JMenuItem i3 = new JMenuItem("Copy");
        p1.add(i1);p1.add(i2);p1.add(i3);
        add(p1);
        
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.show(this,150,150);
    }
}
public class PopUpDemo {
    public static void main(String[] args) {
        PopUp p = new PopUp();
        p.setPop();
    }
    
}
