package student.domain;

public class Student {
    private int num;
    private String name;
    private int kScore;
    private int mScore;
    private int eScore;

    private int totalScore;

    private int average;

    public Student(){};

    public Student(int num, String name, int kScore, int mScore, int eScore) {
        this.num = num;
        this.name = name;
        this.kScore = kScore;
        this.mScore = mScore;
        this.eScore = eScore;
    }

    public void setNum (int num){
        this.num = num;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setKScore (int kScore){
        this.kScore = kScore;
    }
    public void setMScore(int mScore){
        this.mScore = mScore;
    }
    public void setEScore (int eScore){
        this.eScore = eScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public int getAverage() {
        return this.average;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public int getkScore() {
        return kScore;
    }

    public int getmScore() {
        return mScore;
    }

    public int geteScore() {
        return eScore;
    }

    @Override
    public String toString(){
        return "번호 :" +this.num +"번 , 이름 : "+this.name+", 국어점수 : "+this.kScore+"점 , 수학점수: " +this.mScore+"점 , 영어점수 :"+this.eScore+"점, 평균점수 : "+this.average+"점, 총 점수 : "+this.totalScore;
    }


}
