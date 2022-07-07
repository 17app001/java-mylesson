package lesson11;

import java.util.Scanner;

/***
 * 學生分數輸入測試
 */
public class Ch11_2 {

    // 常數宣告
    public static final String[] SUBJECTS = { "國文", "數學", "英文" };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("請輸入第" + (i + 1) + "位姓名:");
            String name = scanner.next();
            students[i] = new Student(name);
            // 分數輸入
            // 1.使用例外處理
            // 2.是否能讓恢復輸入
            double[] scores = new double[SUBJECTS.length];

            int j = 0;
            do {
                System.out.printf("請輸入%s分數:", SUBJECTS[j]);
                try {
                    scores[j] = scanner.nextDouble();
                    j++;
                } catch (java.util.InputMismatchException ex) {
                    scanner.next();
                    System.out.println("輸入錯誤!(請輸入數值)");
                }
            } while (j < SUBJECTS.length);

            // for (int j = 0; j < SUBJECTS.length; j++) {
            // System.out.printf("請輸入%s分數:", SUBJECTS[j]);
            // try {
            // scores[j] = scanner.nextDouble();
            // } catch (java.util.InputMismatchException ex) {
            // j--;
            // scanner.next();
            // System.out.println("輸入錯誤!(請輸入數值)");
            // }
            // }
            // 設定分數
            students[i].setScores(scores);
        }

        // 輸出所有同學資訊
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
