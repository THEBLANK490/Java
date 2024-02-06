/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CheckBoxRadio extends JFrame {
    JCheckBox checkBox1, checkBox2;
    JRadioButton radioButton1, radioButton2;
    JTextArea textArea;

    public void setCheckBoxRadio() {
        checkBox1 = new JCheckBox("Check Box 1");
        checkBox2 = new JCheckBox("Check Box 2");
        radioButton1 = new JRadioButton("Radio Button 1");
        radioButton2 = new JRadioButton("Radio Button 2");
        textArea = new JTextArea(20, 40);

        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adding CheckBoxes
        add(checkBox1);
        add(checkBox2);

        // Adding RadioButtons
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        add(radioButton1);
        add(radioButton2);

        // Adding JTextArea
        add(new JScrollPane(textArea));

        // CheckBox ActionListener
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("Check Box 1 is selected: " + checkBox1.isSelected());
            }
        });

        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("Check Box 2 is selected: " + checkBox2.isSelected());
            }
        });

        // RadioButton ActionListener
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("Radio Button 1 is selected");
            }
        });

        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("Radio Button 2 is selected");
            }
        });
    }
}

public class SwingCheckboxRadioBox {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CheckBoxRadio checkBoxRadio = new CheckBoxRadio();
            checkBoxRadio.setCheckBoxRadio();
        });
    }
}
