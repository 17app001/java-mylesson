package test;

import java.util.Scanner;

public class Ch12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // final String[] SUBJECTS = { "國文", "英文", "數學" };

        // Student[] students = new Student[3];

        while (true) {
            System.out.println("請輸入姓名:(-1:exit)");
            String name = scanner.next();
            if (name.equals("-1")) {
                break;
            }
        }

        System.out.println("系統結束");
        scanner.close();
    }
}
