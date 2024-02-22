package SetA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class StudentForm extends JFrame {

    private JTextField idField, usernameField, passwordField, repasswordField;
    private JRadioButton maleRadio, femaleRadio;
    private JCheckBox javaCheckbox, pythonCheckbox, cCheckbox;
    private JComboBox<String> countryComboBox;
    private JButton submitButton, resetButton;

    public StudentForm() {
        super("Student Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 2));

        JLabel idLabel = new JLabel("ID:");
        add(idLabel);
        idField = new JTextField(10);
        add(idField);

        JLabel usernameLabel = new JLabel("Username:");
        add(usernameLabel);
        usernameField = new JTextField(10);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel);
        passwordField = new JPasswordField(10);
        add(passwordField);

        JLabel repasswordLabel = new JLabel("Re-enter Password:");
        add(repasswordLabel);
        repasswordField = new JPasswordField(10);
        add(repasswordField);

        JLabel genderLabel = new JLabel("Gender:");
        add(genderLabel);
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        add(genderPanel);

        JLabel courseLabel = new JLabel("Course:");
        add(courseLabel);
        javaCheckbox = new JCheckBox("Java");
        pythonCheckbox = new JCheckBox("Python");
        cCheckbox = new JCheckBox("C");
        JPanel coursePanel = new JPanel();
        coursePanel.add(javaCheckbox);
        coursePanel.add(pythonCheckbox);
        coursePanel.add(cCheckbox);
        add(coursePanel);

        JLabel countryLabel = new JLabel("Country:");
        add(countryLabel);
        String[] countries = {"USA", "UK", "Canada", "Australia", "India"};
        countryComboBox = new JComboBox<>(countries);
        add(countryComboBox);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                if (validateForm()) {
                    insertData();
                    JOptionPane.showMessageDialog(StudentForm.this, "Data inserted successfully");
                }
            }
        });
        add(submitButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                resetForm();
            }
        });
        add(resetButton);

        pack();
        setVisible(true);
    }

    private boolean validateForm() {
        if (idField.getText().isEmpty() || usernameField.getText().isEmpty() || passwordField.getText().isEmpty()
                || repasswordField.getText().isEmpty() || (!maleRadio.isSelected() && !femaleRadio.isSelected())
                || (!javaCheckbox.isSelected() && !pythonCheckbox.isSelected() && !cCheckbox.isSelected())) {
            JOptionPane.showMessageDialog(this, "Please fill all fields");
            return false;
        }

        if (!passwordField.getText().equals(repasswordField.getText())) {
            JOptionPane.showMessageDialog(this, "Passwords do not match");
            return false;
        }

        return true;
    }

    private void insertData() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prime", "root", "");
            String query = "INSERT INTO students (id, username, password, gender, course, country) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(idField.getText()));
            statement.setString(2, usernameField.getText());
            statement.setString(3, passwordField.getText());
            statement.setString(4, maleRadio.isSelected() ? "Male" : "Female");
            StringBuilder courseBuilder = new StringBuilder();
            if (javaCheckbox.isSelected()) courseBuilder.append("Java ");
            if (pythonCheckbox.isSelected()) courseBuilder.append("Python ");
            if (cCheckbox.isSelected()) courseBuilder.append("C ");
            statement.setString(5, courseBuilder.toString().trim());
            statement.setString(6, (String) countryComboBox.getSelectedItem());
            statement.executeUpdate();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void resetForm() {
        idField.setText("");
        usernameField.setText("");
        passwordField.setText("");
        repasswordField.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
        javaCheckbox.setSelected(false);
        pythonCheckbox.setSelected(false);
        cCheckbox.setSelected(false);
        countryComboBox.setSelectedIndex(0);
    }
}

public class Ques2 {
        public static void main(String[] args) {
        new StudentForm();
    } 
}
