package lesson4;

import java.util.Scanner;

/**
 * 百貨公司折扣計算2
 */
public class Ch4_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入消費金額:");
        int cost = scanner.nextInt();
        float discount = 1.0f;

        if (cost >= 10000) {
            if (cost >= 100000) {
                discount = 0.75f;
            } else if (cost >= 50000) {
                discount = 0.85f;
            } else if (cost >= 30000) {
                discount = 0.9f;
            } else {
                discount = 0.95f;
            }

            long total = Math.round(cost * discount);
            System.out.printf("總消費金額:%d 折扣為:%d折 金額為:%d",
                    cost, (int) (discount * 100), total);

        } else {
            System.out.printf("消費金額:%d(無折扣)", cost);
        }

        scanner.close();
    }
}
