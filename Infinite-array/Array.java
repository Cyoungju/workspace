public class Array {
    int[] arr = new int[6];
    int arrNum = arr.length;
    int idx;

    public void add(int n){
        // 만약 초기 설정한 값 arrNum 보다 idx가 커질때
        // temp라는 임시 배열을 만든다
        // arr에 주소값을 temp로 복사한다

        if(idx == arrNum){
            arrNum+=3;
            int[] temp = new int[arrNum];

            for(int i = 0;i < arr.length;i++){
                temp[i] = arr[i];
            }

            arr = temp;
        }
        arr[idx] = n;
        idx++;
    }

    public int get(int idx){
        if(idx < arrNum){
            int result = arr[idx];
            return result;
        }else {
            return 0;
        }
    }

    public void update(int idx, int n){
        if(idx < arrNum) {
            arr[idx] = n;
        }
    }

    public boolean remove(int idx){
        if(idx < arrNum) {
            for(int i=idx;i < this.idx-1;i++){
                arr[i] = arr[i+1];
            }
            arr[this.idx-1] = 0;
            this.idx-=1;
            return true;
        }else {
            return false;
        }
    }
}
