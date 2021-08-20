package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?characterEncoding=Latin1","root","password");
            Statement statement = connection.createStatement();


            String insert = "insert into student(id,name,address,PinCode) values(5,'Raj','Maharashtra',474125)";
            String update = "update student set id=5 where id=1";
            String delete = "delete from student where id=5";

            int i  = statement.executeUpdate(insert);
            System.out.println("Row Updated=>"+i);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
