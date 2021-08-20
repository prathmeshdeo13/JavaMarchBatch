package jdbc;

import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =
                        DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc?characterEncoding=Latin1","root","password");
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from employee");

            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
