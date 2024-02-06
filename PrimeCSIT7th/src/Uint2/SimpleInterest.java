/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uint2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SimpleInterestCalculator extends JFrame {
    private JLabel principalLabel, rateLabel, timeLabel, resultLabel;
    private JTextField principalTextField, rateTextField, timeTextField, resultTextField;
    private JButton calculateButton;

    public void setComponents() {
        // Creating objects of JLabel
        principalLabel = new JLabel("Principal:");
        rateLabel = new JLabel("Rate (%):");
        timeLabel = new JLabel("Time (years):");
        resultLabel = new JLabel("Simple Interest:");

        // Creating objects for text fields
        principalTextField = new JTextField(15);
        rateTextField = new JTextField(15);
        timeTextField = new JTextField(15);
        resultTextField = new JTextField(15);
        resultTextField.setEditable(false);

        // Creating a button
        calculateButton = new JButton("Calculate");

        // Adding ActionListener to the Calculate button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSimpleInterest();
            }
        });

        // Adding components into JFrame
        add(principalLabel);
        add(principalTextField);
        add(rateLabel);
        add(rateTextField);
        add(timeLabel);
        add(timeTextField);
        add(resultLabel);
        add(resultTextField);
        add(calculateButton);

        // Adding features of the window
        setLayout(new FlowLayout());
        setVisible(true); // Displaying window

        // If the close button is pressed, then the program will end
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250); // Setting the size of the window
    }

    private void calculateSimpleInterest() {
        try {
            // Get user input
            double principal = Double.parseDouble(principalTextField.getText());
            double rate = Double.parseDouble(rateTextField.getText());
            double time = Double.parseDouble(timeTextField.getText());

            // Calculate simple interest
            double simpleInterest = (principal * rate * time) / 100;

            // Display the result
            resultTextField.setText(String.valueOf(simpleInterest));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values.",
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


public class SimpleInterest {
        public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleInterestCalculator sic = new SimpleInterestCalculator();
                sic.setComponents();
            }
        });
    }
    
}
