package student.controller;

import student.service.TeacherService;
import student.ui.Ui;
import student.util.PlayBoolean;
import student.util.ScannerManager;
import java.util.Scanner;

public class TeacherController {
    Scanner sc = ScannerManager.getInstance();
    PlayBoolean play = PlayBoolean.getInstance();
    TeacherService service = new TeacherService();
    Ui ui = new Ui();


    public void teacherUiSwitch(){
        System.out.println("선생님 입니다.");
        while(play.gettPlay()){
            ui.teacherMenu();
            int txt1 = sc.nextInt();
            switch (txt1){
                case 0 :
                    play.settPlay(false);
                    break;
                case 1 :
                    service.teacherInsert();
                    break;
                case 2 :
                    service.teacherFindAll();
                    break;
                case 3 :
                    service.teacherUpdate();
                    break;
                case 4 :
                    service.teacherDelete();
                    break;
            }
        }
    }


}
