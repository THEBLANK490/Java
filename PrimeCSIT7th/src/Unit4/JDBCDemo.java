package Unit4;
import java.sql.*;//for jdbc

public class JDBCDemo {
    public static void main(String[] args) {
        //Step1: Initialize jdbc Driver on java applicaction
        //it will throw class not found exception if Driver class is missing
        try{
            Connection conn;
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step2:Connect to the database using DataManagergetConnection()
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prime","root","NegativeConjunction490");
                                                   //protocol :servername:port/db   username   password
            //Step 3: use statement objecct ti check and execute query
            Statement st = conn.createStatement();
            if(conn!=null){
                System.out.println("Server Connected");
            }else{
                System.out.println("Server not connected");
            }
            
            //Step4: write proper sql query and execute using statement
            //creating table
//            String tblQuery = "create table tbl_reg(id int primary key,"
//                              + "username varchar(50), password varchar(50),"
//                              + "repassword varchar(50), gender varchar(50),"
//                              + "course varchar(50))";
//            //Step5: executing query
//            st.execute(tblQuery);
//            System.out.println("Table Created");

            //Inserting data in database
//            System.out.println("-----Inserting data in database-----");
//            String insQuery = "insert into tbl_reg values (2,'sam','abcde','abcde','male','bim')";
//            int ans = st.executeUpdate(insQuery);
//            if(ans==1){
//                System.out.println(ans+" row inserted");
//            }
            
            System.out.println("--Retriving data from from database--");
            String disQuery = "select * from tbl_reg";
            ResultSet rs = st.executeQuery(disQuery);
            while(rs.next()){
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String repassword = rs.getString("repassword");
                String gender = rs.getString("gender");
                String course = rs.getString("course");
                System.out.println("id is "+id+" username is "+username+" password is "+password+
                        " repassword is "+repassword+" gender is "+gender+" course is "+course);
            }
            
            //Updating the name to hari and course to BCA whose id is 1
            String upQuery = "update tbl_reg set username ='hari',course='bca'where id=1";
            st.execute(upQuery);
            System.out.println("Record Updated");
            
            //Deleting info of person whose id is 3
            String delQuery ="delete from tbl_reg where id=2";
            st.execute(delQuery);
            System.out.println("Record Deleted");
            conn.close();
            
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException s){
            System.out.println(s);
        }
    }
    
}
