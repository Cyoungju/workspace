package student.temp;

import student.util.DBCon;
import student.util.ScannerManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
    public static void main(String[] args) {
        String sql = "update tbl_students set name=?,kScore=?,mScore=?,eScore=? where num=?";


        Scanner sc = ScannerManager.getInstance();

        System.out.println("수정할 학생 번호를 입력하세요");
        int num = sc.nextInt();
        System.out.println("수정할 학생 이름을 입력하세요.");
        String name = sc.next();
        System.out.println("수정할 국어 점수를 입력하세요.");
        int kScore = sc.nextInt();
        System.out.println("수정할 수학 점수를 입력하세요.");
        int mScore = sc.nextInt();
        System.out.println("수정할 영어 점수를 입력하세요.");
        int eScore = sc.nextInt();

        try {

            PreparedStatement stmt = DBCon.getConnection().prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setInt(2,kScore);
            stmt.setInt(3,mScore);
            stmt.setInt(4,eScore);
            stmt.setInt(5,num);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
