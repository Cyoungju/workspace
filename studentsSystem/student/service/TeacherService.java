package student.service;

import student.dao.Dao;
import student.domain.Score;
import student.domain.Student;
import student.util.ScannerManager;

import java.util.Scanner;

public class TeacherService {
    Scanner sc = ScannerManager.getInstance();
    Dao dao = new Dao();


    public void teacherInsert(){
        Student student = new Student();
        Score score = new Score();

        System.out.println("학생 이름을 입력하세요.");
        student.setName(sc.next());
        System.out.println("국어 점수를 입력하세요.");
        student.setKScore(sc.nextInt());
        System.out.println("수학 점수를 입력하세요.");
        student.setMScore(sc.nextInt());
        System.out.println("영어 점수를 입력하세요.");
        student.setEScore(sc.nextInt());
        student.setTotalScore(score.totalCal(student));
        student.setAverage(score.averageCal(student));
        dao.insertRepository(student);
    }

    public void teacherFindAll(){
        System.out.println("학생 리스트 입니다");
        dao.findAll();
    }

    public void teacherUpdate(){
        Score score = new Score();

        System.out.println("수정할 학생 번호를 입력하세요");
        Student student = dao.fintById(sc.nextInt());
        System.out.println("수정할 학생 이름을 입력하세요.");
        student.setName(sc.next());
        System.out.println("수정할 국어 점수를 입력하세요.");
        student.setKScore(sc.nextInt());
        System.out.println("수정할 수학 점수를 입력하세요.");
        student.setMScore(sc.nextInt());
        System.out.println("수정할 영어 점수를 입력하세요.");
        student.setEScore(sc.nextInt());

        student.setTotalScore(score.totalCal(student));
        student.setAverage(score.averageCal(student));

        dao.updateRepository(student);
    }

    public void teacherDelete(){
        System.out.println("삭제할 학생 번호를 입력하세요");
        Student student = dao.fintById(sc.nextInt());
        dao.deleteRepository(student);
    }
}
