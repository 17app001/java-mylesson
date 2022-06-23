package lesson5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 學生成績輸入(優化版)
 * 增加subjects
 */
public class Ch5_7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 人數
        System.out.print("請輸入學生人數:");
        int count = scanner.nextInt();
        // 科目數
        String[] subjects = { "國文", "英文", "數學" };
        // 姓名
        String[] names = new String[count];
        // 分數
        double[][] scores = new double[count][subjects.length];
        // 輸入
        for (int i = 0; i < count; i++) {
            System.out.printf("請輸入第%d位同學%n", i + 1);
            System.out.print("請輸入姓名:");
            names[i] = scanner.next();
            // 輸入每科分數
            for (int j = 0; j < subjects.length; j++) {
                System.out.printf("請輸入%s分數:", subjects[j]);
                scores[i][j] = scanner.nextDouble();
            }
        }
        // 輸出
        for (int i = 0; i < count; i++) {
            double total = 0;
            for (int j = 0; j < subjects.length; j++) {
                total += scores[i][j];
            }
            double avg = total / subjects.length;
            System.out.printf("%-10s 總分:%6.2f 平均分:%6.2f%n", names[i], total, avg);
        }
        // 檢視
        System.out.println("============================");
        System.out.println(names);
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < scores.length; i++) {
            System.out.println(Arrays.toString(scores[i]));
        }
        scanner.close();
    }
}
