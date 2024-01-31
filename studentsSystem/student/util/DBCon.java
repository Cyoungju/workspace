package student.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/studentsystem";
        String user = "root";
        String password = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
