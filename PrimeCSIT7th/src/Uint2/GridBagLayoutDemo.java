package Uint2;
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt

//places thhe content in form of rectangular grid but we can specify 
//how content should be olaved and how much cell to give for content 
//tospecify the content GridBagConstraint is used

class GridBag extends JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    public void setGridBag(){
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        b5 = new JButton("button5");
        b6 = new JButton("button6");
        //addning gridbag layout
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc= new GridBagConstraints();
        setLayout(gbl);//2 row and each row has 2 col
        setVisible(true);
        setSize(500,500);
        
        //adding b1 in 0,0
        gbc.gridx=0;
        gbc.gridy=0;
        add(b1,gbc);
        gbc.fill =GridBagConstraints.HORIZONTAL;//arrange content horizzontally
        //adding b2 in 1,0
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.fill =GridBagConstraints.HORIZONTAL;//arrange content horizzontally
        add(b2,gbc);
        //adding b3 in 0,1 withh allocting 2 cell
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth =2;//giving 2 cell
        gbc.fill =GridBagConstraints.HORIZONTAL;//arrange content horizzontally
        add(b3,gbc);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

public class GridBagLayoutDemo {
    public static void main(String[] args) {
        GridBag g = new GridBag();
        g.setGridBag();
    }
    
}
