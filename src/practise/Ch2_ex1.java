package practise;

import java.util.Scanner;

public class Ch2_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入資料");
        System.out.println("請輸入姓名");
        String name = scanner.next();
        System.out.println("請輸入分數");
        int score = scanner.nextInt();
        System.out.println("請輸入姓名");
        String name1 = scanner.next();
        System.out.println("請輸入分數");
        int score1 = scanner.nextInt();
        System.out.println("請輸入姓名");
        String name2 = scanner.next();
        System.out.println("請輸入分數");
        int score2 = scanner.nextInt();

        System.out.printf("%s\t%d%n", name, score);
        System.out.printf("%s\t%d%n", name1, score1);
        System.out.printf("%s\t%d%n", name2, score2);

        int total = score + score1 + score2;
        double avg = total / 3;

        System.out.printf("總分為:%d分%n", total);
        System.out.printf("平均分為:%3.2f", avg);

        scanner.close();
    }
}
