package lesson4;

import java.util.Scanner;

/**
 * 1.while true
 * 2.break
 * 3.計算平均分
 */
public class Ch4_10_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("學生成績輸入系統");
        double total = 0;
        int count = 0;

        while (true) {
            System.out.printf("請輸入第%d位成績(-1:離開):", count + 1);
            double score = scanner.nextDouble();
            if (score == -1) {
                break;
            }
            total += score;
            count++;
        }

        System.out.printf("共%d位同學 總分為:%.2f 平均分為:%.2f",
                count, total, total / count);
        scanner.close();

    }
}
