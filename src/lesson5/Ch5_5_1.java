package lesson5;

import java.util.Scanner;
import tools.Tool;

public class Ch5_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請問輸入幾個分數？");

        // while (!scanner.hasNextInt()) {
        // System.out.println("請輸入正確人數(整數)");
        // scanner.next();
        // }

        int count = Tool.getNextInt(scanner);
        double[] scores = new double[count];
        // 輸入
        for (int i = 0; i < scores.length; i++) {
            System.out.println("請輸入第" + (i + 1) + "個分數");
            while (!scanner.hasNextDouble()) {
                System.out.println("請輸入正確分數");
                scanner.next();
            }
            scores[i] = scanner.nextDouble();
        }
        // 分析
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        double avg = total / scores.length;
        // 輸出
        System.out.println("==================================");
        // foreach
        for (double x : scores) {
            System.out.println(x);
        }
        System.out.printf("總分為:%.2f 平均分為:%.2f", total, avg);

        scanner.close();
    }
}
