import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // 랜덤으로 제공된 숫자를 맞춰보는 게임

        //1. 임의의 숫자가 주어진다
        //2.숫자를 이력한다
        //3. 같은지 판별한다
        //3.1 같다면 종료한다
        //3.2 다르면
        //3.2.1 입력수 > 임의수 - 작은수를 입력하세요
        //3.2.1 입력수 < 임의수 - 큰수를 입력하세요

        int rdNum;
        int userNum;

        int score = 100;
        int cut = 0;

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        rdNum = rd.nextInt(99) + 1;

        System.out.println("1~100 사이의 랜덤한 숫자를 맞춰보세요!");
        System.out.println("총 100점이 주어집니다! 문제를 틀릴때 마다 -10점씩 카운팅 됩니다!");
        linePrint(60,"*");

        boolean stop = true;

        while(stop){
            cut++;
            if (score != 0){
                System.out.println(cut + "번째 입력입니다");
                userNum = sc.nextInt();

                if(rdNum == userNum){
                    stop = false;
                    System.out.println("***** 정답입니다 *****");
                }else {
                    score-=10;

                    if(rdNum > userNum){
                        System.out.println("UP!!");
                    }else {
                        System.out.println("DOWN!!");
                    }
                }
                System.out.println("내 점수는 " + score +"점 입니다.");
            }else {
                stop = false;
                System.out.println("랜덤수는 "+ rdNum + " 입니다.");
            }
        }




    }
    static void linePrint(int count, String text){
        for (int i = 0;i< count; i++) {
            System.out.print(text);
        }
        System.out.println();
    }

}
