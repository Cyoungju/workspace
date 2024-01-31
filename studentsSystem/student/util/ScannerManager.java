package student.util;

import java.util.Scanner;

public class ScannerManager {
    private static Scanner sc;

    private ScannerManager(){
         new Scanner(System.in);
    }

    public static Scanner getInstance(){
        if (sc == null){
            sc = new Scanner(System.in);
        }
        return sc;
    }
}
