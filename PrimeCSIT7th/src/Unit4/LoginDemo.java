/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit4;
import javax.swing.*;//swing component
import java.awt.*;//awt compontnt
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author RijanMaharjan
 */
class Login extends JFrame {

    JLabel l1, l2;
    JTextField t1;
    JPasswordField p1;
    JButton b1;
    
    public void setLogin(){
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        t1 = new JTextField(20);
        p1 = new JPasswordField(20);
        b1 = new JButton("submit");
        add(l1);add(t1);
        add(l2);add(p1);
        add(b1);
        setVisible(true);
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String uname = t1.getText();
                String pass = p1.getText();
                
                //database connectivity
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
                    
                    String loginQuery = "select * from tbl_reg where username = ? AND password = ?";
                    PreparedStatement ps = conn.prepareStatement(loginQuery);
                    ps.setString(1, uname);
                    ps.setString(2, pass);
                    ResultSet rs = ps.executeQuery();
                    
                    if(rs.next()){
                        System.out.println(" login success");
                        System.out.println(" data are: ");
                        System.out.println(" id is " + rs.getInt("id"));
                        System.out.println(" username is " + rs.getString("username"));
                        System.out.println(" gender is " + rs.getString("gender"));
                        System.out.println(" course is " + rs.getString("course"));
                    }else{
                        System.out.println(" username or password incorrect");
                    }
                    
                } catch (ClassNotFoundException c) {
                    System.out.println(c);
                } catch (SQLException s) {
                    System.out.println(s);
                }
            }
            
        });
    }
}
public class LoginDemo {
    public static void main(String[] args) {
         Login l1 = new Login();
         l1.setLogin();
    }
}
