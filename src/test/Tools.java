package test;

import java.util.Scanner;

public class Tools {
    public static int checkHasNextInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("請輸入正確的整數的數值");
            scanner.next();
        }

        return scanner.nextInt();
    }
}
