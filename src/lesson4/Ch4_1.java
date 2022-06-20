package lesson4;

import java.util.Scanner;

/**
 * 單向與多向式判斷
 */
public class Ch4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入分數:");
        int score = scanner.nextInt();
        String level;
        // 多向式判斷
        if (score == 100) {
            level = "A+";
        } else if (score >= 90) {
            level = "A";
        } else if (score >= 80) {
            level = "B";
        } else if (score >= 70) {
            level = "C";
        } else if (score >= 60) {
            level = "D";
        } else {
            level = "E";
        }

        System.out.printf("分數:%d 評比%s", score, level);
        System.out.println();

        // 巢狀式判斷
        if (score >= 60) {
            if (score == 100) {
                level = "A+";
            } else if (score >= 90) {
                level = "A";
            } else if (score >= 80) {
                level = "B";
            } else if (score >= 70) {
                level = "C";
            } else {
                level = "D";
            }
        } else {
            if (score >= 60) {
                level = "E";
            } else if (score >= 50) {
                level = "F";
            } else if (score >= 40) {
                level = "G";
            } else {
                level = "H";
            }
        }

        System.out.printf("分數:%d 評比%s", score, level);
        scanner.close();
    }
}
