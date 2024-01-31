package student.domain;

public class Score {
    public int totalCal(Student student){
        return student.geteScore() + student.getkScore() + student.getmScore();
    }

    public int averageCal(Student student) {
        return totalCal(student) / 3;
    }
}
