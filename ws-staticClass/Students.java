public class Students {

    private int sno;
    private String name;

    static int number;

    public Students(String name) {
        number++;
        this.sno = number;
        this.name = name;
    }

    public void showInfo(){
        System.out.println(this.sno+"번 "+this.name+"입니다.");
    }

}
