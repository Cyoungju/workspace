package student.controller;

import student.ui.Ui;
import student.util.PlayBoolean;
import student.util.ScannerManager;
import java.util.Scanner;

public class Controller {
    Scanner sc = ScannerManager.getInstance();
    PlayBoolean play = PlayBoolean.getInstance();
    TeacherController teacherController = new TeacherController();
    StudentController studentController = new StudentController();

    Ui ui = new Ui();

    public void startController(){
        // 시작 안내문 출력
        ui.uiStart();

        while(play.getPlay()){
            swichCase();
        }
    }

    public void swichCase(){
        int stNum = sc.nextInt();
        switch (stNum){
            case 1 :
                teacherController.teacherUiSwitch();
                break;
            case 2 :
                studentController.studentUiSwitch();
                break;
            case 0:
                play.setPlay(false);
                break;
        }
    }
}
