import java.util.Arrays;
import java.util.Random;

//배열
public class main {
    private static Object ArrCount;

    public static void main(String[] args) {


        int[] arr = {1,2,3}; // 자료의 숫자가 곧 크기 - 선언과 동시에 초기화

        //int[] arr1 = new int[3]; // 선언


        int[] temp = new int[arr.length * 2];
        for(int i = 0; i < arr.length;i++){
            temp[i] = arr[i];
        }

        arr = temp;


//        System.out.print("arr[] = {");
//        for(int j =0;j < arr.length;j++){
//            int i = arr[j];
//            System.out.print(i+ ",");
//        }
//        System.out.print("}");

        //System.out.println(Arrays.toString(arr));
        arrPrint(arr);

        // 정리
        // 1. 배열 선언할수 있다
        // 2. 배열 표기법을 활용해서 배열공간에 데이터를 저장할수 있다
        // 3. 반복문을 이용해서 배열을 출력할수 있다


        // =========================================================


        // 주사위를 100번 굴릴거임 (주사위눈 1~6)
        // 각각의 숫자가 몇번 나오는지 기록하고싶음
        // 화면에 출력하시오

        // 문제정의
        // 1. 랜덤수 정의 (주사위 1~6)
        // 2. 100번 굴리는동안 나온 숫자를 배열에 담는다
        // 3. 배열에 담겨있는 숫자를 카운팅한다
        // 4. 각각의 카운팅된 숫자를 출력함

        Random rd = new Random();
        int rdNum;

        int[] arrCount = new int[6];


        for(int j = 0;j < 100; j++){
            rdNum = rd.nextInt(6) + 1;

            arrCount[rdNum-1] ++;

//            if(rdNum == 1) {
//                arrCount[0] += 1;
//            }else if(rdNum == 2){
//                arrCount[1] += 1;
//            }else if(rdNum == 3){
//                arrCount[2] += 1;
//            }else if(rdNum == 4){
//                arrCount[3] += 1;
//            }else if(rdNum == 5){
//                arrCount[4] += 1;
//            }else if(rdNum == 6){
//                arrCount[5] += 1;
//            }

        }

        //System.out.println(Arrays.toString(arrCount));
        /*
        for(int k = 0; k < arrCount.length; k++) {
            System.out.println("arrCont["+ k + "]"+ "=" + arrCount[k]);
        }
*/
        arrPrint(arrCount);



        // ==========================================================

        // 로또번호 추첨기
        // 중복된수를 배제하고 6개를 나오게 한다


        // 요구사항
        // 1. 6개의 랜덤된수 발생
        // 2. 배열에 넣기
        // 3. 중복된수가 있는지 확인후 제외 시키기
/*
        Random rd = new Random();
        int rdNum;
        boolean flag = true;

        int[] lotto = new int[6];

        for(int i=0;i<lotto.length;i++){
            rdNum = rd.nextInt(6) + 1;
            if(i == 0){
                lotto[i] = rdNum;
            }else {
                for(int j = 0;j <= i;j++){
                    if(rdNum == lotto[j]){
                        i--;
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    lotto[i] = rdNum;
                }
                flag = true;
            }
        }
        System.out.println(Arrays.toString(lotto));

*/

        Random rd1 = new Random();
        int rdNum1;
        int[] lotto = new int[6];
        boolean flag = true;


        for(int i=0;i<lotto.length;i++){
            rdNum1 = rd1.nextInt(45) + 1; //랜덤 돌리기

            if(i == 0){ // lotto[0] - 첫번째 숫자는 무조건 넣기
                lotto[i] = rdNum1;
            }else{
                // 반복이 있는지 검사해야함
                for(int j = 0; j <= i;j++){ // lotto[1] 일때는 1번 비교
                    if(rdNum1 == lotto[j]){
                        i--;
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    lotto[i] = rdNum1;
                }
            }
            flag = true;
        }
        //System.out.println(Arrays.toString(lotto));
        arrPrint(lotto);
    }

    // ================================================

    // 무한 증식 배열


    // ================================================

    public static void arrPrint(int count[]){
        System.out.print("[");
        for(int k = 0; k < count.length; k++) {
            System.out.print(count[k]);
            if(k != count.length-1){
                System.out.print(",");
            }

        }
        System.out.println("]");
    }

}
