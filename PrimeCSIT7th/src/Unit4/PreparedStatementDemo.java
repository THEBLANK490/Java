package Unit4;
import java.sql.*;//for jdbc
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try{
            Connection conn;
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/prime";
            String username = "root";
            String password = "NegativeConjunction490";
            conn = DriverManager.getConnection(url,username,password);
            
            //taking user input
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your id");
            int id =sc.nextInt();
            System.out.println("Enter your username");
            String uname =sc.next();
            System.out.println("Enter your password");
            String pass =sc.next();
            System.out.println("Enter your Repass");
            String repass =sc.next();
            System.out.println("Enter your gender");
            String gender =sc.next();
            System.out.println("Enter your course");
            String course =sc.next();
            
            String insQuery ="insert into tbl_reg values (?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insQuery);
            ps.setInt(1, id);
            ps.setString(2, uname);
            ps.setString(3,pass);
            ps.setString(4,repass);
            ps.setString(5,gender);
            ps.setString(6,course);
            ps.execute();
            System.out.println("Data Inserted");
            
            System.out.println("--Displaying data using prepare statement.--");
            //displaying data according to gender given by the user
            String disQuery ="select * from tbl_reg where gender =?";
            System.out.println("Enter Gender for which you want to display ");
            String disGen = sc.next();
            PreparedStatement ps1 = conn.prepareStatement(disQuery);
            ps1.setString(1,disGen);
            ResultSet rs = ps1.executeQuery();
            while(rs.next()){
                int rid = rs.getInt("id");
                String rname = rs.getString("username");
                String rpass = rs.getString("password");
                String rrepass = rs.getString("rePassword");
                String rgender = rs.getString("gender");
                String rcourse = rs.getString("course");
                System.out.println("id is "+rid+" username is "+rname+" password is "+rpass+
                        " repassword is "+rrepass+" gender is "+rgender+" course is "+rcourse);
            }
            
            
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
    
}
