package Unit2;
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt
import java.awt.event.*;//event listerner ko lagi 
import javax.swing.event.*;
import java.util.*;

class SwingComponent2 extends JFrame{
    //creating combo box: generate two event : action and item event
    //action event is generated when combo box is clicked and
    //item event is generated when item is selected
    JComboBox cb1;
    JLabel l1,l2;
    JList<String> jl1;
    public void setComponents(){
        String []subject = {"Java","DMDW","AD","Project","POM"};
        cb1 = new JComboBox(subject);
        l1 = new JLabel("Result");
        String []extra = {"Digital Logic","CG","AI","Biology","Nepali","Compiler","Software engineering","Data Structure","Maths","Java Programming"};
        jl1 = new JList(extra);
        l2 = new JLabel("result of list");
        jl1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        //adding scollbar
        JScrollPane sp = new JScrollPane();
        sp.add(jl1);
        
        //adding componenet to window
        add(cb1);
        add(l1);
        add(jl1);
        add(l2);
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //handling event generated from combobox
        //item event
        cb1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e){
                String item = (String)cb1.getSelectedItem();
                l1.setText("You selected "+item+" item");
            }
        });
        
        //handling event grnerated from list
        //list throes list selection event
        jl1.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                ArrayList <String> res = (ArrayList <String>) jl1.getSelectedValuesList();
                for(String r1:res){
                    l2.setText(r1 + ",");
                    System.out.println();
                }
            }
            
        });
        
    }
}
public class SwingControl2Demo {
    public static void main(String[] args) {
        SwingComponent2 sc = new SwingComponent2();
        sc.setComponents();
    }
}
