package lesson12;

import java.util.Scanner;
import lesson11.Student;
import java.util.ArrayList;
import java.util.Comparator;

/***
 * 學生分數輸入測試
 * 使用ArrayList
 */
public class Ch12_2 {

    // 常數宣告
    public static final String[] SUBJECTS = { "國文", "數學", "英文" };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 宣告集合
        ArrayList<Student> students = new ArrayList<Student>();
        int i = 0;
        // 改用while迴圈輸入(直到-1離開)
        while (true) {
            System.out.print("請輸入第" + (i + 1) + "位姓名:(-1:exit)");
            String name = scanner.next();
            // 比對是否是離開條件
            if (name.equals("-1")) {
                break;
            }

            Student student = new Student(name);
            // 分數輸入(使用例外處理)
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

            student.setScores(scores);
            students.add(student);
            i++;
        }

        // 第二種排序
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Student.getAvg(o1) == Student.getAvg(o2) ? 0
                        : Student.getAvg(o1) > Student.getAvg(o2) ? -1 : 1;
            }
        });

        // 第一種排序(實作Comparable介面)
        // Collections.sort(students);
        // 輸出姓名跟分數 %10s %6.2f
        students.forEach(student -> {
            System.out.printf("%-10s 平均分:%6.2f%n",
                    student.getName(), Student.getAvg(student));
        });

        System.out.println("輸入結束.");
        scanner.close();
    }
}
