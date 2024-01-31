import java.sql.*;


public class App {
    public static void main(String[] args) {
//        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/dbtabletest?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8";
        String user = "root";
        String password = "1234";

//        try {
//            Class.forName(driver);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        String sql = "INSERT INTO tbl_students(name,age,gender) VALUES(?,?,?)";

        try {
            // 1. db연결, 접속
            Connection conn = DriverManager.getConnection(url, user, password);

            // 2.쿼리(질의어) 실행
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "임꺽정");
            stmt.setInt(2, 32);
            stmt.setString(3, "남");
            stmt.executeUpdate();

            // 3. db로 부터 결과받기 - selete (ResultSet)
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
