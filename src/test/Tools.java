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

    public static String arrayToString(Object[] array) {
        StringBuilder sb = new StringBuilder("{");

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                sb.append(array[i] + ",");
                continue;
            }
            sb.append(array[i]).append("}");
        }

        return sb.toString();
    }
}
