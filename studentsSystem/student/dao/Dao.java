package student.dao;

import student.domain.Student;
import student.util.DBCon;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    public void insertRepository(Student student){
        String sql = "INSERT INTO tbl_students(name,kScore,mScore,eScore,totalScore,average) VALUES(?,?,?,?,?,?)";
        try {

            // 1. db연결, 접속

            // 2.쿼리(질의어) 실행
            PreparedStatement stmt = DBCon.getConnection().prepareStatement(sql);

            stmt.setString(1, student.getName());
            stmt.setInt(2, student.getkScore());
            stmt.setInt(3, student.getmScore());
            stmt.setInt(4, student.geteScore());
            stmt.setInt(5, student.getTotalScore());
            stmt.setInt(6, student.getAverage());
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.getMessage();
        }
    }

    public Student fintById(int num){
        String sql = "select * from tbl_students where num=?";
        try {
            PreparedStatement stmt = DBCon.getConnection().prepareStatement(sql);

            stmt.setInt(1, num);

            ResultSet rs = stmt.executeQuery();

            Student stu = new Student();
            if(rs.next()){
                stu.setNum(rs.getInt("num"));
                stu.setName(rs.getString("name"));
                stu.setKScore(rs.getInt("kScore"));
                stu.setMScore(rs.getInt("mScore"));
                stu.setEScore(rs.getInt("eScore"));
                return stu;
            }
            return null;



        }catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }


    public void findAll(){
        String sql = "select * from tbl_students";
        try {
            // 1. db연결, 접속

            // 2.쿼리(질의어) 실행
            Statement stmt = DBCon.getConnection().createStatement();
            stmt.executeQuery(sql);

            // 3. db로 부터 결과받기 - selete (ResultSet)
            ResultSet rs = stmt.executeQuery(sql);
            List<Student> students = new ArrayList<>();

            // db로부터 받은 자료를 객체에 담는것까지
            while(rs.next()){  // 맨처음에 컬럼열을 가리키고 있음 - 다음열로 넘김(마지막 데잍가 끝날때까지) = ture
                Student stu = new Student();

                stu.setNum(rs.getInt("num"));
                stu.setName(rs.getString("name"));
                stu.setKScore(rs.getInt("kScore"));
                stu.setMScore(rs.getInt("mScore"));
                stu.setEScore(rs.getInt("eScore"));
                stu.setTotalScore(rs.getInt("totalScore"));
                stu.setAverage(rs.getInt("average"));

                students.add(stu);
            }

            for(Student s : students){ //배열에 담겨있는 요소들을 하나씩 꺼내보기 - Student타입인 s라는 변수를 만들어서 for문 돌때마다 처리문에서 변수를 이용해서 처리해줌
                System.out.println(s.toString()); // 처리문
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateRepository(Student student){
        try {
            String sql = "update tbl_students set name=?,kScore=?,mScore=?,eScore=?,totalScore=?,average=? where num=?";

            PreparedStatement stmt = DBCon.getConnection().prepareStatement(sql);
            stmt.setString(1, student.getName());
            stmt.setInt(2,student.getkScore());
            stmt.setInt(3,student.getmScore());
            stmt.setInt(4,student.geteScore());
            stmt.setInt(5, student.getTotalScore());
            stmt.setInt(6, student.getAverage());
            stmt.setInt(7,student.getNum());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteRepository(Student student){
        String sql = "delete from tbl_students where num=?";

        try {
            PreparedStatement stmt = DBCon.getConnection().prepareStatement(sql);
            stmt.setInt(1, student.getNum());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
