package Unit4;

//import javax.swing.*;//swing component
//import java.awt.*;//awt compontnt
//import java.awt.event.*;
import java.sql.*;
import javax.sql.rowset.*;

public class RowSetDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            JdbcRowSet r1 = RowSetProvider.newFactory().createJdbcRowSet();

            //connecting to database
            String url = "jdbc:mysql://localhost:3306/prime_java";
            r1.setUrl(url);
            r1.setUsername("root");
            r1.setPassword("");

            //display data
            r1.setCommand("select * from tbl_reg");
            r1.execute();

            while (r1.next()) {
                System.out.println(" id is " + r1.getInt("id"));
                System.out.println(" username is " + r1.getString("username"));
                System.out.println(" course is " + r1.getString("course"));
                System.out.println(" gender is " + r1.getString("gender"));
            }

            //by default scrollable
            System.out.println(" --executing third row of table");
            r1.absolute(3);
            System.out.println(" id is " + r1.getInt("id"));
            System.out.println(" username is " + r1.getString("username"));
            System.out.println(" course is " + r1.getString("course"));
            System.out.println(" gender is " + r1.getString("gender"));

            System.out.println(" --executing last row of table");
            r1.last();
            System.out.println(" id is " + r1.getInt("id"));
            System.out.println(" username is " + r1.getString("username"));
            System.out.println(" course is " + r1.getString("course"));
            System.out.println(" gender is " + r1.getString("gender"));

        } catch (ClassNotFoundException c) {
            System.out.println(c);
        } catch (SQLException s) {
            System.out.println(s);
        }

    }
}
