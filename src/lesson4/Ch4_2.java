package lesson4;

import java.util.Scanner;

public class Ch4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入消費金額:");
        int cost = scanner.nextInt();
        double discount = 1.0;

        if (cost >= 10000) {
            if (cost >= 100000) {
                discount = 0.75;
            } else if (cost >= 50000) {
                discount = 0.85;
            } else if (cost >= 30000) {
                discount = 0.9;
            } else {
                discount = 0.95;
            }
            System.out.printf("消費金額:%d 折扣:%d折 金額為:%.0f元",
                    cost, (int) (discount * 100), cost * discount);
        } else {
            System.out.printf("消費金額:%d 折扣:%s 金額為:%.0f元",
                    cost, "無", cost * discount);
        }

        scanner.close();
    }
}
