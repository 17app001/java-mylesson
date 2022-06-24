package ex;

import java.util.Scanner;
import tools.Tool;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("火車票計費程式");

        System.out.println("1.自強 2.3元");
        System.out.println("2.莒光 1.78元");
        System.out.println("3.區間 1.45元");
        System.out.println("請輸入選擇:");
        int choice = Tool.getNextInt(scanner);

        System.out.println("請輸入公里數:");
        int km = Tool.getNextInt(scanner);

        double kmPay = 0;
        String train = "";
        boolean error = false;

        switch (choice) {
            case 1:
                kmPay = 2.3;
                train = "自強";
                break;
            case 2:
                kmPay = 1.78;
                train = "莒光";
                break;
            case 3:
                kmPay = 1.45;
                train = "區間";
                break;
            default:
                error = true;
        }

        if (error) {
            System.out.println("輸入錯誤！");
        } else {
            double total = km * kmPay;
            System.out.printf("您選擇%d %s %.0f元", choice, train, total);
        }

        scanner.close();
    }
}
