public class Main {
    public static void main(String[] args) {


        // 학생이 버스를 이용하는것 - 학생이 버스에 의존적임(학생한테는 버스가 필요함)
        Student st1 = new Student("홍길동", 10000);
        Student st2 = new Student("이몽룡", 10000);
        Bus bus = new Bus("100-1");
        // 버스 번호는 외부에서 입력해야하는게 맞음

        st1.takeBus(bus);
        st2.takeBus(bus);

        st1.studentInfoPrint();
        st2.studentInfoPrint();

        bus.busInfoPrint();


    }
}
