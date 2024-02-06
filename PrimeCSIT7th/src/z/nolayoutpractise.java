package z;

import javax.swing.JButton;
import javax.swing.JFrame;

public class nolayoutpractise {

    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("No Layout Manager Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout manager to null
        frame.setLayout(null);

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        // Set bounds for each button
        button1.setBounds(50, 50, 100, 30);
        button2.setBounds(200, 50, 100, 30);

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);

        // Set frame size and make it visible
        frame.setSize(400, 150);
        frame.setVisible(true);
    }
}
