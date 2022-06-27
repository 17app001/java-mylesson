package ex;

import java.util.Scanner;

public class Ex4_3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("學生成績輸入系統");
        double total = 0;
        int count = 0;
        while (true) {
            System.out.print("請輸入姓名:(-1:exit)");
            String name = scanner.next();
            if (name.equals("-1")) {
                break;
            }

            double score = 0;
            while (true) {
                System.out.printf("請輸入第%d位%s成績:", count + 1, name);
                score = scanner.nextDouble();
                if (score >= 0 && score <= 100) {
                    break;
                }

                System.out.println("分數輸入錯誤!");
            }

            total += score;
            count++;
        }

        System.out.println("共" + count + "位同學");
        // NaN==> Not a number
        if (count > 0) {
            System.out.println(total + "," + total / count);
        }
        scanner.close();
    }
}
