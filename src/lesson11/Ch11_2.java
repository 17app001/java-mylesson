package lesson11;

import java.util.Scanner;

public class Ch11_2 {

    public static final String[] SUBJECTS = { "國文", "數學", "英文" };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("請輸入姓名:");
            String name = scanner.next();
            students[i] = new Student(name);
            // 分數輸入
            double[] scores = new double[SUBJECTS.length];
            for (int j = 0; j < SUBJECTS.length; j++) {
                System.out.printf("請輸入%s分數:", SUBJECTS[j]);
                scores[j] = scanner.nextDouble();
            }

            students[i].setScores(scores);
        }

        // 輸出所有同學資訊
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
