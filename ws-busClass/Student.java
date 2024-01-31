public class Student {
    private String stuName;
    private int money;


    public Student(String stuName, int money){
        this.stuName = stuName;
        this.money = money;
    }


    // 학생이 버스를 탄다 - 버스 클래스를 가지고 있어야함
    public void takeBus(Bus bus){ //매개변수에다가 입력되어야함
        int busPrice = 1000;
        this.money -= busPrice;
        // 생성되어있는 클래스를 이용해야함 new Bus();를 해버리면 새로운 객체가 생성되어버림 (Bus객체는 메인에 생성되어있으니까 매개변수로 받아서 사용)
        bus.take(busPrice);
    }


    public void studentInfoPrint(){
        System.out.println(stuName+" 학생의 남은돈은 " +money+"입니다.");
    }

}
