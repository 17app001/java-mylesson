package lesson5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 學生成績輸入
 * 使用二維陣列
 */
public class Ch5_7 {
    public static void main(String[] args) {
        // 人數
        int count = 3;
        // 科目數
        int subjects = 3;
        // 姓名
        String[] names = new String[count];
        // 分數
        double[][] scores = new double[count][subjects];

        Scanner scanner = new Scanner(System.in);
        // 輸入
        for (int i = 0; i < count; i++) {
            System.out.printf("請輸入第%d位同學%n", i + 1);
            System.out.print("請輸入姓名:");
            names[i] = scanner.next();

            for (int j = 0; j < subjects; j++) {
                System.out.printf("請輸入第%d科分數:", j + 1);
                scores[i][j] = scanner.nextDouble();
            }
        }
        // 輸出
        for (int i = 0; i < count; i++) {
            double total = 0;
            for (int j = 0; j < subjects; j++) {
                total += scores[i][j];
            }
            double avg = total / subjects;
            System.out.printf("%-10s 總分:%6.2f 平均分:%6.2f%n", names[i], total, avg);
        }

        System.out.println("============================");
        System.out.println(names);
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(scores));

        scanner.close();
    }
}
