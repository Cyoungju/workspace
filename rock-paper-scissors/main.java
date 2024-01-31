import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int win = 0;
        int lose = 0;
        int same = 0;
        int total = 5;

        int rdNum; //컴퓨터가 내는 랜덤수 
        int str; // 사용자가 입력한 숫자

        linePrint(30, "=");
        System.out.println("가위바위보 게임을 시작합니다!");

        for (int i = total; i > 0;i--) {
            linePrint(30, "=");
            System.out.println(i+"판 남았습니다!");
            System.out.println("가위바위보중 하나를 선택해주세요!");
            System.out.println("1. 가위 , 2. 바위, 3. 보");


            str = sc.nextInt();
            rdNum = rd.nextInt(2) + 1;


            if(str >= 4){ // 올바르지 못한 입력값
                System.out.println("1~3 사이의 숫자를 입력해 주세요.");
                i++;
            }else {

                if (str == rdNum) {
                    same++;
                    System.out.println("**무승부**");
                } else if (str == 1) { // 1.가위
                //사용자 중심 - 모든 경우의 수
                    if(rdNum == 2){
                        System.out.println("당신은 가위를 냈습니다");
                        System.out.println("상대는 바위를 냈습니다");
                        System.out.println("**패**");
                        lose++;
                    }else if(rdNum == 3){// 1가위 2보
                        System.out.println("당신은 가위를 냈습니다");
                        System.out.println("상대는 보를 냈습니다");
                        System.out.println("**승**");
                        win++;
                    }
                } else if (str == 2) {// 2. 바위
                    if(rdNum == 1){
                        System.out.println("당신은 가위를 냈습니다");
                        System.out.println("상대는 보를 냈습니다");
                        System.out.println("**승**");
                        win++;
                    } else if (rdNum == 3) {
                        System.out.println("당신은 바위를 냈습니다");
                        System.out.println("상대는 보를 냈습니다");
                        System.out.println("**패**");
                        lose++;
                    }

                } else if (str == 3) { // 3. 보
                    if(rdNum == 1){
                        System.out.println("당신은 보를 냈습니다");
                        System.out.println("상대는 가위를 냈습니다");
                        System.out.println("**패**");
                        lose++;
                    }else if(rdNum == 2){
                        System.out.println("당신은 보를 냈습니다");
                        System.out.println("상대는 바위를 냈습니다");
                        System.out.println("**승**");
                        win++;
                    }
                }
            }



            if(i == 1){
                linePrint(30, "=");
                System.out.println("게임을 더 진행하시겠습니까?");
                System.out.println("1. 네, 2. 아니요");

                int moreGame = sc.nextInt();

                if(moreGame == 1){
                    linePrint(30, "=");
                    System.out.println("추가 5판 더 진행 합니다!");
                    i +=5;
                    total+=5;
                } 
            }
        }
        linePrint(50, "=");
        System.out.println(total+"전 "+win + "승 " + same + "무 " + lose + "패");

        // 유효성 검사

/*

        // =============================
        //while(true)문 - 메소드 안에 넣어야 돌아감 (지금은 main메소드 안에 있기 때문에 에러 안남)

        int i = 0; // 초기값
        int stop = 1;

        while(stop != 0){ //조건식
            i++; // 증감식
            System.out.println("============================");
            System.out.println("가위바위보중 하나를 선택해주세요!");
            System.out.println("1. 가위 , 2. 바위, 3. 보");
            str = sc.nextInt();
            rdNum = rd.nextInt(2) + 1;
            if(str >= 4){ // 올바르지 못한 입력값
                System.out.println("1~3 사이의 숫자를 입력해 주세요.");
                i++;
            }else {
                if (str == rdNum) {
                    same++;
                    System.out.println("**무승부**");
                } else if (str == 1) { // 1.가위
                    //사용자 중심 - 모든 경우의 수
                    if (rdNum == 2) {
                        System.out.println("당신은 가위를 냈습니다");
                        System.out.println("상대는 바위를 냈습니다");
                        System.out.println("**패**");
                        lose++;
                    } else if (rdNum == 3) {// 1가위 2보
                        System.out.println("당신은 가위를 냈습니다");
                        System.out.println("상대는 보를 냈습니다");
                        System.out.println("**승**");
                        win++;
                    }
                } else if (str == 2) {// 2. 바위
                    if (rdNum == 1) {
                        System.out.println("당신은 가위를 냈습니다");
                        System.out.println("상대는 보를 냈습니다");
                        System.out.println("**승**");
                        win++;
                    } else if (rdNum == 3) {
                        System.out.println("당신은 바위를 냈습니다");
                        System.out.println("상대는 보를 냈습니다");
                        System.out.println("**패**");
                        lose++;
                    }

                } else if (str == 3) { // 3. 보
                    if (rdNum == 1) {
                        System.out.println("당신은 보를 냈습니다");
                        System.out.println("상대는 가위를 냈습니다");
                        System.out.println("**패**");
                        lose++;
                    } else if (rdNum == 2) {
                        System.out.println("당신은 보를 냈습니다");
                        System.out.println("상대는 바위를 냈습니다");
                        System.out.println("**승**");
                        win++;
                    }
                }
                System.out.println("게임을 더 진행하시겠습니까?");
                System.out.println("1. 네, 0. 아니요");
                stop = sc.nextInt();
            }

        }

        System.out.println("============================");
        System.out.println(total+"전 "+win + "승 " + same + "무 " + lose + "패");
*/
    }
    static void linePrint(int count, String text){
        for (int i = 0;i< count; i++) {
            System.out.print(text);
        }
        System.out.println();
    }
}
