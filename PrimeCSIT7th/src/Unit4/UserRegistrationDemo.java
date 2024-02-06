/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit4;

import javax.swing.*;//swing component
import java.awt.*;//awt compontnt
import java.awt.event.*;
import java.sql.*;

class Register extends JFrame {

    JLabel l0, l1, l2, l3, l4, l5, l6;
    JTextField t0, t1;
    JPasswordField p1, p2;
    JRadioButton r1, r2;
    JCheckBox c1, c2, c3;
    JButton b1;

    public void setRegister() {
        l0 = new JLabel("ID");
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        l3 = new JLabel("Repassword");
        l4 = new JLabel("Gender");
        l5 = new JLabel("Course");
        l6 = new JLabel("Result");
        t0 = new JTextField(20);
        t1 = new JTextField(20);
        p1 = new JPasswordField(20);
        p2 = new JPasswordField(20);
        r1 = new JRadioButton("male");
        r2 = new JRadioButton("female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        c1 = new JCheckBox("JAVA");
        c2 = new JCheckBox("C++");
        c3 = new JCheckBox("PYTHON");
        b1 = new JButton("submit");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //extracting value of form field
                String id = t0.getText();
                String uname = t1.getText();
                String pass = p1.getText();
                String repass = p2.getText();
                String gender = "";
                if (r1.isSelected()) {
                    gender += "male";
                } else {
                    gender += "female";
                }
                String course = "";
                if (c1.isSelected()) {
                    course += "JAVA" + ",";
                }
                if (c2.isSelected()) {
                    course += "C++" + ",";
                }
                if (c3.isSelected()) {
                    course += "PYTHON" + ",";
                }

                //jdbc connection
                try {
                    Connection conn;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    String url = "jdbc:mysql://localhost:3306/prime_java";
                    String username = "root";
                    String password = "";
                    conn = DriverManager.getConnection(url, username, password);

                    //Step 3: use statement object to check and execute query
                    Statement st = conn.createStatement();
                    if (conn != null) {
                        System.out.println("Server Connected");
                    } else {
                        System.out.println("Server not connected");
                    }

                    //query
                    System.out.println("-----Inserting data in database-----");
                    String insQuery = "insert into tbl_reg values('"+id+"','"+uname+"','"+pass+"','"+repass+"','"+gender+"','"+course+"')";
                    int ans = st.executeUpdate(insQuery);
                    if (ans >= 1) {
                        l6.setText("row inserted");
                    }
                    else{
                        l6.setText("row not inserted");
                    }

                } catch (ClassNotFoundException c) {
                    System.out.println(c);
                } catch (SQLException s) {
                    System.out.println(s);
                }
            }

        });
        add(l0);add(t0);
        add(l1);add(t1);
        add(l2);add(p1);
        add(l3);add(p2);
        add(l4);add(r1);add(r2);
        add(l5);add(c1);add(c2);add(c3);
        add(l6);
        add(b1);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class UserRegistrationDemo {

    public static void main(String[] args) {
        Register r1 = new Register();
        r1.setRegister();
    }
}
