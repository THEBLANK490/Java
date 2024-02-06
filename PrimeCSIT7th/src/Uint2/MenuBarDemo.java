package Uint2;
//Menu Bar is a tab that contains sequence of item known as menu
//menu contains collection of items known as menu items
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt

class Menu extends JFrame{
    public void setMenu(){
        //creating menu list
        JMenuBar mb = new JMenuBar();
        //creating first menu
        JMenu m1 = new JMenu("File");
        
        //adding mnemonic: shortcut key
        m1.setMnemonic('f');
        
        //creating menu items for first item
        JMenuItem i1 = new JMenuItem("Open",'o');
        JMenuItem i2 = new JMenuItem("Save",'s');
        JMenuItem i3 = new JMenuItem("Save as",'a');
        //adding item on menu1
        m1.add(i1);m1.add(i2);m1.add(i3);
        //adding menu on menubar
        mb.add(m1);
        
        //adding branching  adding sub component on particular enu item
        JMenu m2 = new JMenu("New");
        m2.setMnemonic('n');
        JMenuItem i4 = new JMenuItem("i4");
        JMenuItem i5 = new JMenuItem("i5");
        JMenuItem i6= new JMenuItem("i6");
        m2.add(i4);m2.add(i5);m2.add(i6);
        m1.add(m2);
        
        //CheckboxMenuItem can be set on and off
        JMenu m3 = new JMenu("Edit");
        JCheckBoxMenuItem c1 = new JCheckBoxMenuItem("Copy",true);
        JCheckBoxMenuItem c2 = new JCheckBoxMenuItem("Paste");
        JCheckBoxMenuItem c3 = new JCheckBoxMenuItem("Cut");
        m3.add(c1);m3.add(c2);m3.add(c3);
        mb.add(m3);
        
        //RadioButtonmenuitem
        JMenu m4 = new JMenu("View");
        JRadioButtonMenuItem r1 = new JRadioButtonMenuItem("Zoom");
        JRadioButtonMenuItem r2 = new JRadioButtonMenuItem("StatusBar");
        m4.add(r1);m4.add(r2);
        mb.add(m4);
        
        add(mb);//adding menubar on JFrame
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
public class MenuBarDemo {
    public static void main(String[] args) {
        Menu m = new Menu();
        m.setMenu();
    }
}
