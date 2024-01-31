package student.temp;

import student.util.DBCon;
import student.util.ScannerManager;

import java.sql.*;
import java.util.Scanner;

public class InsertTest {
    public static void main(String[] args) {
        String sql = "INSERT INTO tbl_students(name,kScore,mScore,eScore) VALUES(?,?,?,?)";

        Scanner sc = ScannerManager.getInstance();

        System.out.println("학생 이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("국어 점수를 입력하세요.");
        int kScore = sc.nextInt();
        System.out.println("수학 점수를 입력하세요.");
        int mScore = sc.nextInt();
        System.out.println("영어 점수를 입력하세요.");
        int eScore = sc.nextInt();


        try {
            // 1. db연결, 접속

            // 2.쿼리(질의어) 실행
            PreparedStatement stmt = DBCon.getConnection().prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setInt(2, kScore);
            stmt.setInt(3, mScore);
            stmt.setInt(4, eScore);
            stmt.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
