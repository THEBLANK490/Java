/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//mouse event is generated whenever mouse is clicked, moved, hover on content
//to handle mouse event mouseListener interface should be used
class MouseEventExample extends JFrame{
    JLabel l1;
    JTextField t1;
    public void setMouseEvent(){
        l1 = new JLabel("Result");
        t1 = new JTextField(15);
        t1.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("mouse clicked");

            }

            @Override
            public void mousePressed(MouseEvent e) {
                //whene the mouse butto nis continuoously pressed
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("Mouse Pressed");

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //whene mouse is pressed and released out of component 
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //when mouse cursor is entered into compoent
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                l1.setText("mouse exited");
            }
        
        });
        add(l1);
        add(t1);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class MouseEventDemo {
    public static void main(String[] args) {
        MouseEventExample me = new MouseEventExample();
        me.setMouseEvent();
    }
}