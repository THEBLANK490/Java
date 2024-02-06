//generally result set point to first row of table and move forwards and b default reset cannot be used to update data
//by using updatable and scrollable result set we can move to pointer to any row of a table ie we can access 3rd row , 
//last row and any row according to our need
package Unit4;
import java.sql.*;//for jdbc
import java.util.Scanner;

public class UpdatableAndScrollableResultSet {
    public static void main(String[] args) {
 try {
            Connection conn;
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step2:Connect to the database using DataManagergetConnection()
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prime", "root", "NegativeConjunction490");
            //protocol :servername:port/db   username   password
            //Step 3: use statement objecct ti check and execute query
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //for scrolling into table, //read only
            //display query
            String disQuery = "select * from tbl_reg";
            ResultSet rs = st.executeQuery(disQuery);
            //fetching last row
            System.out.println("Data in last row is ");
            rs.last();
            System.out.println("id is " + rs.getInt("id"));
            System.out.println("username is " + rs.getString("username"));
            System.out.println("pass is " + rs.getString("password"));
            System.out.println("repass is " + rs.getString("repassword"));
            System.out.println("gender is " + rs.getString("gender"));
            System.out.println("courses is " + rs.getString("course"));
            
            //fetching any row: fetching third row
            rs.absolute(3); ///fetch 3rd row
            System.out.println("id is " + rs.getInt("id"));
            System.out.println("username is " + rs.getString("username"));
            System.out.println("pass is " + rs.getString("password"));
            System.out.println("repass is " + rs.getString("repassword"));
            System.out.println("gender is " + rs.getString("gender"));
            System.out.println("courses is " + rs.getString("course"));
            
            //currently we are in 3rd row to fetch data of next row
            //next() method is used
            rs.next();//it will move to 4th row 
            System.out.println("id is " + rs.getInt("id"));
            System.out.println("username is " + rs.getString("username"));
            System.out.println("pass is " + rs.getString("password"));
            System.out.println("repass is " + rs.getString("repassword"));
            System.out.println("gender is " + rs.getString("gender"));
            System.out.println("courses is " + rs.getString("course"));
            conn.close();

        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
}
