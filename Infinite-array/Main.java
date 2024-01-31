import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array();

        array.add(0);
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.add(70);
        array.add(80);
        array.add(90);
        array.add(100);
        array.add(110);
        array.update(1, 10000);
        array.remove(5);
        System.out.println(Arrays.toString(array.arr));
        System.out.println(array.get(1));
        System.out.println(array.remove(5));



    }
}
