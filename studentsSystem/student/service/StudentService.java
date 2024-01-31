package student.service;

import student.dao.Dao;
import student.domain.Student;
import student.util.PlayBoolean;
import student.util.ScannerManager;

import java.util.Scanner;

public class StudentService {
    Scanner sc = ScannerManager.getInstance();
    PlayBoolean play = PlayBoolean.getInstance();
    Dao dao = new Dao();


    public void studentFindAll(){
        System.out.println("내 정보 조회를 원하시면 학생번호를 입력하세요");

        Student student = dao.fintById(sc.nextInt());
        if(student != null) {
            System.out.println(student.toString());
            play.setPlay(false);
            play.setsPlay(false);

        }else {
            System.out.println("학생정보가 없습니다.");

        }
    }
}
