package student.temp;

import student.domain.Student;
import student.util.DBCon;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SelectTest {
    public static void main(String[] args) {
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

                students.add(stu);
            }
            // stack 에 있는 stu는 하나만 있고 반복문을 돌때마다 가르키는 주소값이(heap영역이) 달라짐
            // stack       heap
            //  stu  ----- #100
            //         |-- #200

            for(Student s : students){ //배열에 담겨있는 요소들을 하나씩 꺼내보기 - Student타입인 s라는 변수를 만들어서 for문 돌때마다 처리문에서 변수를 이용해서 처리해줌
                System.out.println(s.toString()); // 처리문
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
