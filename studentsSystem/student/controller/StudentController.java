package student.controller;

import student.service.StudentService;
import student.util.PlayBoolean;

public class StudentController {
    StudentService service = new StudentService();
    PlayBoolean play = PlayBoolean.getInstance();
    public void studentUiSwitch(){
        System.out.println("학생 입니다.");
        while(play.getsPlay()){
            service.studentFindAll();
        }
    }
}
