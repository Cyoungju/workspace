package student.temp;

import student.util.DBCon;
import student.util.ScannerManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest {
    public static void main(String[] args) {

        String sql = "delete from tbl_students where num=?";

        Scanner sc = ScannerManager.getInstance();

        System.out.println("삭제할 학생 번호를 입력하세요");
        int num = sc.nextInt();


        try {
            PreparedStatement stmt = DBCon.getConnection().prepareStatement(sql);
            stmt.setInt(1, num);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
