package lesson4;

import java.util.Scanner;

/**
 * 1.優化程式
 * 2.輸出目前第幾位同學
 * 3.計算平均分
 */
public class Ch4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("學生成績輸入系統");
        double total = 0;
        boolean go = true;
        // 使用not ==>!
        while (go) {
            System.out.print("請輸入成績:");
            double score = scanner.nextDouble();
            total += score;
            System.out.println("是否繼續?(y/n)");
            String input = scanner.next().toLowerCase();
            if (input.equals("n")) {
                go = false;
            }
        }

        System.out.println(total);
        scanner.close();
    }
}
