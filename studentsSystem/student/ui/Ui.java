package student.ui;

import java.util.Scanner;

public class Ui {
    public void uiStart(){
        try {
            System.out.println("학생 정보 관리 프로그램을 실행합니다.");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
            System.out.println(".");
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        System.out.println("구분을 선택해주세요");
        System.out.println("1. 선생님, 2. 학생, 0. 시스템종료");

    }

    public void teacherMenu(){
        System.out.println("====================");
        System.out.println("관리 프로그램을 선택해주세요");
        System.out.println("1. 학생정보 추가");
        System.out.println("2. 학생정보 조회");
        System.out.println("3. 학생정보 수정");
        System.out.println("4. 학생정보 삭제");
        System.out.println("0. 이전으로 돌아가기");
        System.out.println("====================");
    }
}
