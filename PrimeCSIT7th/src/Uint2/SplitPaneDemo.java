package Uint2;
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt

//split pane divide the component into two part
class SplitPane extends JFrame{
    JTextField t1;
    JComboBox c1;
    JPanel p1,p2;
    public void Split(){
        t1 = new JTextField(15);
        String []course={"advance java","DWDM","DBA","SPM","Project"};
        c1 = new JComboBox(course);
        p1 = new JPanel();
        p2 = new JPanel();
        p1.add(c1);p2.add(t1);
        //Creating spiltPane
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
//        sp.setOrientation(JSplitPane.VERTICAL_SPLIT);//slider orientation
        sp.setOneTouchExpandable(true);//to collapse and release slider
        sp.setDividerSize(50);//gap between two component or slider size
        add(sp);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}

public class SplitPaneDemo {
    public static void main(String[] args) {
        SplitPane s = new SplitPane();
        s.Split();
    }
    
    
}
