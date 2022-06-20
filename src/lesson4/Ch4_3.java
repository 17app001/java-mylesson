package lesson4;

import java.util.Scanner;

/**
 * SWITCH CASE的使用
 */
public class Ch4_3 {
    public static void main(String[] args) {
        int choice = 1;

        if (choice == 1) {
            System.out.println("你選擇了(1)");
        } else if (choice == 2) {
            System.out.println("你選擇了(2)");
        } else {
            System.out.println("輸入錯誤!");
        }

        switch (choice) {
            case 1:
                System.out.println("你選擇了(1)");
                break;
            case 2:
                System.out.println("你選擇了(2)");
                break;
            default:
                System.out.println("輸入錯誤!");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.printf("是否繼續?(y/n)");
        String choice1 = scanner.next();

        if (choice1.equals("y") || choice1.equals("Y")) {
            System.out.println("選擇繼續");
        }

        switch (choice1) {
            case "y":
            case "Y":
                System.out.println("選擇繼續");
                break;
            default:
                System.out.println("結束");

        }

        scanner.close();

    }
}
