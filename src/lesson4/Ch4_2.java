package lesson4;

import java.util.Scanner;

/**
 * 百貨公司折扣計算1
 */
public class Ch4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入消費金額:");
        int cost = scanner.nextInt();

        if (cost >= 10000) {
            if (cost >= 100000) {
                System.out.printf("總消費金額:%d 折扣為:%d折 金額為:%d",
                        cost, 75, (int) (cost * 0.75));
            } else if (cost >= 50000) {
                System.out.printf("總消費金額:%d 折扣為:%d折 金額為:%d",
                        cost, 85, (int) (cost * 0.85));
            } else if (cost >= 30000) {
                System.out.printf("總消費金額:%d 折扣為:%d折 金額為:%d",
                        cost, 9, (int) (cost * 0.9));
            } else {
                System.out.printf("總消費金額:%d 折扣為:%d折 金額為:%d",
                        cost, 95, (int) (cost * 0.95));
            }

        } else {
            System.out.printf("消費金額:%d(無折扣)", cost);
        }

        scanner.close();
    }
}
