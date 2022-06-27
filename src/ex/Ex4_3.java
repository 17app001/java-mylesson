package ex;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("學生成績輸入系統");
        double total = 0;
        int count = 0;
        while (true) {
            System.out.print("請輸入姓名:");
            String name = scanner.next();
            System.out.printf("請輸入第%d位%s成績:", count + 1, name);
            double score = scanner.nextDouble();
            if (score < 0 || score > 100) {
                System.out.println("分數輸入錯誤!");
                continue;
            }

            total += score;
            count++;
            System.out.println("是否繼續?(y/n)");
            if (!scanner.next().toLowerCase().equals("y")) {
                break;
            }
        }

        System.out.println("共" + count + "位同學");
        System.out.println(total + "," + total / count);
        scanner.close();
    }
}
