public class Bus {
    private String busName;
    private int people;
    private int total;

    public Bus(String busName){
        this.busName = busName;
    } // 버스 번호는 외부에서 입력해야하는게 맞음



    //승객과 수입은 함께 움직여야함 - 버스에 학생이 타는 함수
    public void take(int total) {
        this.people += 1;
        this.total += total; //버스 가격이 변할수도 있으니까 변수로 사용
    }

    public void busInfoPrint(){
        System.out.println(busName+"번 버스의 승객수는 " +people+"명 이고, 총 수입은 "+total+"원 입니다.");
    }


}
