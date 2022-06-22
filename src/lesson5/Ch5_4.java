package lesson5;

import java.util.Scanner;

public class Ch5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] scores = new double[3];
        // 輸入
        for (int i = 0; i < scores.length; i++) {
            System.out.println("請輸入第" + (i + 1) + "個分數");
            scores[i] = scanner.nextDouble();
        }

        // 分析
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        double avg = total / scores.length;

        // 輸出
        System.out.println("==================================");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + "," + scores[i]);
        }
        System.out.println("==================================");
        // 反向輸出
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.println(i + "," + scores[i]);
        }
        System.out.println("==================================");

        // foreach
        for (double x : scores) {
            System.out.println(x);
        }

        System.out.printf("總分為:%.2f 平均分為:%.2f", total, avg);

        scanner.close();
    }
}
